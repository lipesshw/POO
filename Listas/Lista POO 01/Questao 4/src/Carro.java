class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String cor, int potencia, int anoFabricacao, float valor, int numeroPortas) {
        super(cor, potencia, anoFabricacao, valor);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}