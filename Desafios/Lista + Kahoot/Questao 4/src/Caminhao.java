class Caminhao extends Veiculo {
    private float capacidadeCarga;

    public Caminhao(String cor, int potencia, int anoFabricacao, float valor, float capacidadeCarga) {
        super(cor, potencia, anoFabricacao, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}