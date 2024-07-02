import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class InterfaceGrafica extends JFrame {
    private Cruzamento cruzamento;
    private Semaforo semaforo1;
    private Semaforo semaforo2;
    private boolean isRunning;
    private int posCarro1;
    private int posCarro2;
    private final int passo = 7; // Velocidade do movimento dos carros
    private BufferedImage buffer; // Buffer para double buffering
    private BufferedImage carroVerticalImg; // Imagem do carro vertical
    private BufferedImage carroHorizontalImg; // Imagem do carro horizontal
    private boolean carroHorizontalPassou; // Flag para controlar se o carro horizontal já passou
    private boolean carroVerticalPassou; // Flag para controlar se o carro vertical já passou

    public InterfaceGrafica() {
        this.setResizable(false);
        this.cruzamento = new Cruzamento();
        this.semaforo1 = new Semaforo("tradicional", 5000, 7000); // Semaforo1 fica vermelho 7 segundos
        this.semaforo2 = new Semaforo("tradicional", 5000, 7000); // Semaforo2 fica vermelho 7 segundos
        this.semaforo1.abre();  // Começamos com o semáforo1 aberto
        this.cruzamento.adicionaSemaforo(semaforo1);
        this.cruzamento.adicionaSemaforo(semaforo2);
        this.isRunning = true;
        this.posCarro1 = 600; // Posição inicial do carro 1
        this.posCarro2 = -180;   // Posição inicial do carro 2
        this.carroHorizontalPassou = false;
        this.carroVerticalPassou = false;

        // Carregar imagens dos carros
        try {
            carroVerticalImg = ImageIO.read(new File("src/assets/carroVertical.png"));
            carroHorizontalImg = ImageIO.read(new File("src/assets/carroHorizontal.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.setTitle("Simulação de Cruzamento");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painelSuperior = new JPanel();
        String[] tipos = {"tradicional", "digital"};
        JComboBox<String> tipoComboBox = new JComboBox<>(tipos);
        painelSuperior.add(tipoComboBox);

        tipoComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoSelecionado = (String) tipoComboBox.getSelectedItem();
                semaforo1.setTipo(tipoSelecionado);
                semaforo2.setTipo(tipoSelecionado);
                // Redesenha a interface quando o tipo do semáforo muda
                updateBuffer();
            }
        });

        this.add(painelSuperior, BorderLayout.NORTH);

        // Cria o buffer
        buffer = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);

        // Thread para controlar a sincronização dos semáforos
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isRunning) {
                    cruzamento.sincroniza();
                    try {
                        Thread.sleep(7000); // Tempo em milissegundos para o semáforo 1 ficar vermelho
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    semaforo1.fecha(); // Fechar semáforo 1 após o tempo de vermelho
                    semaforo2.abre(); // Abrir semáforo 2
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            // Redesenha a interface após a sincronização dos semáforos
                            updateBuffer();
                        }
                    });

                    try {
                        Thread.sleep(13000); // Tempo em milissegundos para o semáforo 2 ficar vermelho
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    semaforo2.fecha(); // Fechar semáforo 2 após o tempo de vermelho
                    semaforo1.abre(); // Abrir semáforo 1
                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            // Redesenha a interface após a sincronização dos semáforos
                            updateBuffer();
                        }
                    });
                }
            }
        }).start();

        // Thread para controlar o movimento dos carros
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (isRunning) {
                    if (semaforo1.estaAberto()) {
                        if (posCarro1 > -carroVerticalImg.getHeight() && !carroVerticalPassou) {
                            posCarro1 -= passo;
                            if (posCarro1 <= -carroVerticalImg.getHeight()) {
                                // Carro vertical passou completamente
                                carroVerticalPassou = true;
                                semaforo1.fecha();
                                semaforo2.abre();
                            }
                        } else {
                            // Semáforo vermelho ou após passar, voltar à posição inicial
                            posCarro1 = 810;
                            carroVerticalPassou = false;
                        }
                    }

                    if (semaforo2.estaAberto()) {
                        if (posCarro2 < getWidth() && !carroHorizontalPassou) {
                            posCarro2 += passo;
                            if (posCarro2 >= getWidth()) {
                                // Carro horizontal passou completamente
                                carroHorizontalPassou = true;
                                semaforo2.fecha();
                                semaforo1.abre();
                            }
                        } else {
                            // Semáforo vermelho ou após passar, voltar à posição inicial
                            posCarro2 = -carroHorizontalImg.getWidth();
                            carroHorizontalPassou = false;
                        }
                    }

                    SwingUtilities.invokeLater(new Runnable() {
                        @Override
                        public void run() {
                            // Redesenha a interface após o movimento dos carros
                            updateBuffer();
                        }
                    });
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    private void updateBuffer() {
        Graphics g = buffer.getGraphics();
        paint(g);
        g.dispose();
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Desenha o cruzamento no buffer
        Graphics2D g2d = (Graphics2D) buffer.getGraphics();
        g2d.setStroke(new BasicStroke(130)); // Define a espessura da linha

        g2d.setColor(Color.BLACK);
        g2d.drawLine(400, 0, 400, 600); // Linha vertical
        g2d.drawLine(0, 300, 800, 300); // Linha horizontal

        // Desenha faixas pontilhadas nos limites do cruzamento
        g2d.setStroke(new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND, 0, new float[]{10}, 0));
        g2d.setColor(Color.WHITE);

        g2d.drawLine(0, 300, 340, 300); // Linha horizontal esquerda
        g2d.drawLine(465, 300, 800, 300); // Linha horizontal direita

        g2d.drawLine(400, 0, 400, 240); // Linha vertical superior
        g2d.drawLine(400, 375, 400, 600); // Linha vertical inferior

        // Desenha os semáforos
        if (semaforo1.estaAberto()) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.RED);
        }
        g2d.fillRect(465, 365, 20, 20); // Semáforo 1 (vertical)

        if (semaforo2.estaAberto()) {
            g2d.setColor(Color.GREEN);
        } else {
            g2d.setColor(Color.RED);
        }
        g2d.fillRect(315, 215, 20, 20); // Semáforo 2 (horizontal)

        // Desenha os carros
        g2d.drawImage(carroVerticalImg, 385, posCarro1, null); // Carro vertical
        g2d.drawImage(carroHorizontalImg, posCarro2, 215, null); // Carro horizontal

        // Desenha o buffer na tela principal
        g.drawImage(buffer, 0, 0, null);
    }
}
