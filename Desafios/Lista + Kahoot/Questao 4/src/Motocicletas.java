class Motocicleta extends Veiculo {
    private int cilindradas;

    public Motocicleta(String cor, int potencia, int anoFabricacao, float valor, int cilindradas) {
        super(cor, potencia, anoFabricacao, valor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}