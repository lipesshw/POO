import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Painel extends JPanel implements KeyListener {

    private int lnBoneco = 0, coBoneco = 6;
    private BufferedImage personagem;
    private BufferedImage terra, grama, pedra, picareta, flor;
    private int tamanhoPixel = 64; 
    private Boolean paraFrente = true;
    private int objSelecionado = 0;

    List<List<Integer>> mapa = new ArrayList<>();

    public Painel() {
        inicializaMapa();
        setBackground(Color.cyan);
        addKeyListener(this);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    try {
                        if (paraFrente) {
                            mapa.get(coBoneco).set(lnBoneco + 1, objSelecionado);
                        } else {
                            mapa.get(coBoneco).set(lnBoneco - 1, objSelecionado);
                        }
                    } catch (ArrayIndexOutOfBoundsException ex) {
                        // Ignorar exceção
                    }
                    repaint();
                }
            }
        });
        setFocusable(true);

        try {
            personagem = ImageIO.read(getClass().getResource("./assets/personagem.png"));
            grama = ImageIO.read(getClass().getResource("./assets/grama.png"));
            pedra = ImageIO.read(getClass().getResource("./assets/pedra.png"));
            terra = ImageIO.read(getClass().getResource("./assets/terra.png"));
            picareta = ImageIO.read(getClass().getResource("./assets/picareta.png"));
            flor = ImageIO.read(getClass().getResource("./assets/flor.png"));
        } catch (IOException ex) {
            Logger.getLogger(Painel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        pintaMapa(g2);
        pintaPersonagem(g2);
        pintaInventario(g2);
    }

    private void pintaMapa(Graphics2D g2) {
        for (int i = 0; i < mapa.size(); i++) {
            for (int j = 0; j < mapa.get(i).size(); j++) {
                switch (mapa.get(i).get(j)) {
                    case 1:
                        g2.drawImage(grama, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                        break;
                    case 2:
                        g2.drawImage(terra, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                        break;
                    case 3:
                        g2.drawImage(pedra, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                        break;
                    case 4:
                        g2.drawImage(flor, j * tamanhoPixel, i * tamanhoPixel, tamanhoPixel, tamanhoPixel, null);
                        break;
                }
            }
        }
    }

    private void pintaPersonagem(Graphics2D g2) {
        int larguraJanela = getWidth();
        int alturaJanela = getHeight();
        int posicaoXPersonagem = paraFrente ? tamanhoPixel + (lnBoneco * tamanhoPixel) : lnBoneco * tamanhoPixel;
        int posicaoYPersonagem = coBoneco * tamanhoPixel;
        int larguraPersonagem = paraFrente ? -tamanhoPixel : tamanhoPixel;

        g2.drawImage(personagem, posicaoXPersonagem, posicaoYPersonagem, larguraPersonagem, tamanhoPixel, null);
        g2.drawRect(paraFrente ? (lnBoneco + 1) * tamanhoPixel : (lnBoneco - 1) * tamanhoPixel, coBoneco * tamanhoPixel, tamanhoPixel, tamanhoPixel);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Não utilizado
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_A) {
            if (paraFrente) {
                paraFrente = false;
            } else {
                if (podeCaminhar()) {
                    lnBoneco--;
                }
            }
            aplicaGravidade();
        }
        if (e.getKeyCode() == KeyEvent.VK_D) {
            if (!paraFrente) {
                paraFrente = true;
            } else {
                if (podeCaminhar()) {
                    lnBoneco++;
                }
            }
            aplicaGravidade();
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (!podeCaminhar()) {
                coBoneco--;
                if (podeCaminhar()) {
                    if (paraFrente) {
                        lnBoneco++;
                    } else {
                        lnBoneco--;
                    }
                }
                aplicaGravidade();
            }
        }
        if (e.getKeyCode() >= KeyEvent.VK_0 && e.getKeyCode() <= KeyEvent.VK_4) {
            objSelecionado = e.getKeyCode() - KeyEvent.VK_0;
        }
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // Não utilizado
    }

    public void inicializaMapa() {
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0));
        mapa.add(Arrays.asList(1, 1, 0, 0, 0, 0, 1, 1, 3, 2, 0, 0, 0, 0, 0, 0, 3, 0, 0 ,0));
        mapa.add(Arrays.asList(2, 2, 1, 1, 0, 1, 2, 3, 3, 3, 1, 1, 4, 4, 0, 3, 3, 3, 0, 0));
        mapa.add(Arrays.asList(2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1));
        mapa.add(Arrays.asList(2, 2, 2, 3, 3, 3, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2));
        mapa.add(Arrays.asList(3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));

        int larguraMapa = getWidth() / tamanhoPixel;
        int alturaMapa = getHeight() / tamanhoPixel;

        while (mapa.size() < alturaMapa) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 0; j < larguraMapa; j++) {
                linha.add((int) (Math.random() * 5));
            }
            mapa.add(linha);
        }
    }


    public void aplicaGravidade() {
        new Thread(() -> {
            try {
                while (mapa.get(coBoneco + 1).get(lnBoneco) == 0) {
                    coBoneco++;
                    Thread.sleep(30);
                    repaint();
                }
            } catch (ArrayIndexOutOfBoundsException | InterruptedException e) {
                // Ignorar exceção
            }
        }).start();
    }

    public boolean podeCaminhar() {
        try {
            if (paraFrente) {
                return mapa.get(coBoneco).get(lnBoneco + 1) == 0;
            } else {
                return mapa.get(coBoneco).get(lnBoneco - 1) == 0;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }

    private void pintaInventario(Graphics2D g) {
        g.drawRect(500, 0, 295, 90);

        defineCorInventario(g, 0);
        g.drawImage(picareta, 505, 5, 50, 50, null);
        g.drawString("0", 525, 80);

        defineCorInventario(g, 1);
        g.drawImage(grama, 565, 5, 50, 50, null);
        g.drawString("1", 585, 80);

        defineCorInventario(g, 2);
        g.drawImage(terra, 625, 5, 50, 50, null);
        g.drawString("2", 645, 80);

        defineCorInventario(g, 3);
        g.drawImage(pedra, 685, 5, 50, 50, null);
        g.drawString("3", 707, 80);

        defineCorInventario(g, 4);
        g.drawImage(flor, 745, 5, 50, 50, null);
        g.drawString("4", 765, 80);
    }

    public void defineCorInventario(Graphics2D g, int qualVaiRenderizar) {
        if (objSelecionado == qualVaiRenderizar) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Minecraft", Font.BOLD, 16));
        } else {
            g.setColor(Color.WHITE);
            g.setFont(new Font("Minecraft", Font.PLAIN, 14));
        }
    }
}

