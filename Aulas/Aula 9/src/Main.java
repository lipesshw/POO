public class Main {
    public static void main(String[] args) {
        ContaCorrente conta[] = new ContaCorrente[2];
        conta[0] = new ContaCorrente("001", 1050, 15000);
        conta[1] = new ContaCorrente("002", 1060, 5000);

        ContaPoupanca poupanca[] = new ContaPoupanca[2];
        poupanca[0] = new ContaPoupanca("001", 1115, 500);
        poupanca[1] = new ContaPoupanca("002", 1116, 1000);

        Banco banco = new Banco("Banco VidaReta", conta, poupanca);

        System.out.println(banco);
    }
}
