public class Main {
    public static void main(String[] args) {

        Motocicleta moto = new Motocicleta("Preto", 250, 2020, 15000, 160);
        Carro carro = new Carro("Azul", 150, 2018, 40000, 4);
        Caminhao caminhao = new Caminhao("Branco", 300, 2015, 80000, 5000);

        System.out.println("\nInformações da Motocicleta:");
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Potência: " + moto.getPotencia() + " cc");
        System.out.println("Ano de Fabricação: " + moto.getAnoFabricacao());
        System.out.println("Valor: R$ " + moto.getValor());
        System.out.println("Cilindradas: " + moto.getCilindradas());

        System.out.println("\nInformações do Carro:");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Potência: " + carro.getPotencia() + " CV");
        System.out.println("Ano de Fabricação: " + carro.getAnoFabricacao());
        System.out.println("Valor: R$ " + carro.getValor());
        System.out.println("Número de Portas: " + carro.getNumeroPortas());

        System.out.println("\nInformações do Caminhão:");
        System.out.println("Cor: " + caminhao.getCor());
        System.out.println("Potência: " + caminhao.getPotencia() + " CV");
        System.out.println("Ano de Fabricação: " + caminhao.getAnoFabricacao());
        System.out.println("Valor: R$ " + caminhao.getValor());
        System.out.println("Capacidade de Carga: " + caminhao.getCapacidadeCarga() + " kg");
    }
}