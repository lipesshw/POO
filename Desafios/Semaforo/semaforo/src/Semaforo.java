public class Semaforo {
    private boolean aberto;
    private String tipo; // "digital" ou "tradicional"
    private int tempoAberto;
    private int tempoFechado;

    public Semaforo(String tipo, int tempoAberto, int tempoFechado) {
        this.tipo = tipo;
        this.tempoAberto = tempoAberto;
        this.tempoFechado = tempoFechado;
        this.aberto = false;
    }

    public void abre() {
        this.aberto = true;
    }

    public void fecha() {
        this.aberto = false;
    }

    public boolean estaAberto() {
        return this.aberto;
    }

    public boolean estaFechado() {
        return !this.aberto;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
