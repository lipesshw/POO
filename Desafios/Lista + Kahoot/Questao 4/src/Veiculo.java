class Veiculo {
    private String cor;
    private int potencia;
    private int anoFabricacao;
    private float valor;

    public Veiculo(String cor, int potencia, int anoFabricacao, float valor) {
        this.cor = cor;
        this.potencia = potencia;
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
