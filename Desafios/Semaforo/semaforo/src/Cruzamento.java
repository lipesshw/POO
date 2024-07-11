
import javax.swing.*;
import java.awt.*;

public class Cruzamento extends JPanel {
    private Semaforo semaforoHorizontal;
    private Semaforo semaforoVertical;
    private boolean eDigital;
    private Timer timer;
    private ImageIcon fundo;

    public Cruzamento() {
        this.semaforoHorizontal = new Semaforo();
        this.semaforoVertical = new Semaforo();
        this.eDigital = false;
        this.fundo = new ImageIcon("img/fundo.png");

        iniciarTempo();
    }

    private void iniciarTempo() {
        timer = new Timer(1000, e -> {
            atualizarTempoSemaforos();
            repaint();
        });
        timer.start();
    }

    public void SincronizaSemaforo() throws InterruptedException {
        while (true) {
            semaforoHorizontal.mudarParaVerde(5);
            semaforoVertical.mudarParaVermelho(7);
            Thread.sleep(5000); // 5 segundos

            semaforoHorizontal.mudarParaAmarelo(2);
            Thread.sleep(2000); // 2 segundos

            semaforoHorizontal.mudarParaVermelho(7);
            semaforoVertical.mudarParaVerde(5);
            Thread.sleep(5000); // 5 segundos

            semaforoVertical.mudarParaAmarelo(2);
            Thread.sleep(2000); // 2 segundos
        }
    }

    private void atualizarTempoSemaforos() {
        if (semaforoHorizontal.getTempoRestante() > 0) {
            semaforoHorizontal.setTempoRestante(semaforoHorizontal.getTempoRestante() - 1);
        }
        if (semaforoVertical.getTempoRestante() > 0) {
            semaforoVertical.setTempoRestante(semaforoVertical.getTempoRestante() - 1);
        }
    }


    public void alterarSemaforo() {
        eDigital = !eDigital;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Desenha o fundo
        if (fundo != null) {
            g.drawImage(fundo.getImage(), 0, 0, getWidth(), getHeight(), this);
        }

        // Desenha os semáforos
        if (eDigital) {
            SemaforoDigital(g, semaforoHorizontal, 490, 238); // Semáforo horizontal
            SemaforoDigital(g, semaforoVertical, 175, 345);   // Semáforo vertical
        } else {
            SemaforoAnalogico(g, semaforoHorizontal, 490, 238); // Semáforo horizontal
            SemaforoAnalogico(g, semaforoVertical, 195, 345);   // Semáforo vertical
        }
    }

    private void SemaforoDigital(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D digital = (Graphics2D) g;
        digital.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        digital.setColor(Color.BLACK);
        digital.fillRoundRect(x, y, 50, 90, 10, 10);

        // suporte metálico
        if (y < getHeight() / 2) { // ssemáforo superior
            digital.setColor(Color.GRAY);
            digital.fillRect(x + 20, y - 15, 10, 15); // retângulo do suporte
            digital.fillRect(x + 25, y - 25, 2, 10);  // haste do suporte
        } else { // ssemáforo inferior
            digital.setColor(Color.GRAY);
            digital.fillRect(x + 20, y + 90, 10, 15); // retângulo do suporte
            digital.fillRect(x + 25, y + 105, 2, 10); // haste do suporte
        }

        digital.setColor(semaforo.getCor());
        digital.fillOval(x + 15, y + 10, 20, 20);

        digital.setColor(Color.WHITE);
        digital.setFont(new Font("Inter", Font.BOLD, 20));
        String tempoRestante = String.valueOf(semaforo.getTempoRestante());
        digital.drawString(tempoRestante, x + 25 - digital.getFontMetrics().stringWidth(tempoRestante) / 2, y + 70); // Exibe o tempo restante
    }

    private void SemaforoAnalogico(Graphics g, Semaforo semaforo, int x, int y) {
        Graphics2D analogico = (Graphics2D) g;
        analogico.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Desenha o corpo do semáforo
        analogico.setColor(Color.BLACK);
        analogico.fillRoundRect(x, y, 30, 90, 10, 10);

        // suporte metálico
        if (y < getHeight() / 2) { // semáforo superior
            analogico.setColor(Color.GRAY);
            analogico.fillRect(x + 10, y - 15, 10, 15); // retângulo do suporte
            analogico.fillRect(x + 15, y - 25, 2, 10);  // haste do suporte
        } else { // semáforo inferior
            analogico.setColor(Color.GRAY);
            analogico.fillRect(x + 10, y + 90, 10, 15); // retângulo do suporte
            analogico.fillRect(x + 15, y + 105, 2, 10); // haste do suporte
        }

        analogico.setColor(semaforo.getCor() == Color.RED ? Color.RED : Color.DARK_GRAY);
        analogico.fillOval(x + 5, y + 5, 20, 20);
        analogico.setColor(semaforo.getCor() == Color.YELLOW ? Color.YELLOW : Color.DARK_GRAY);
        analogico.fillOval(x + 5, y + 35, 20, 20);
        analogico.setColor(semaforo.getCor() == Color.GREEN ? Color.GREEN : Color.DARK_GRAY);
        analogico.fillOval(x + 5, y + 65, 20, 20);
    }

}
