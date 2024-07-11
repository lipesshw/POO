
import java.awt.Color;

public class Semaforo {
    private Color cor;
    private int tempoRestante;

    public Semaforo() {
        this.cor = Color.RED;
        this.tempoRestante = 0;
    }

    public Color getCor() {
        return cor;
    }

    public void setCor(Color cor, int tempo) {
        this.cor = cor;
        this.tempoRestante = tempo;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public void mudarParaVerde(int tempo) {
        setCor(Color.GREEN, tempo);
    }

    public void mudarParaAmarelo(int tempo) {
        setCor(Color.YELLOW, tempo);
    }

    public void mudarParaVermelho(int tempo) {
        setCor(Color.RED, tempo);
    }
}
