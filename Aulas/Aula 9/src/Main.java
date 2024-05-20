public class Main {
    public static void main(String[] args) {
        ContaCorrente corrente[] = new ContaCorrente[2];
        corrente[0] = new ContaCorrente("001", 1050, 15000);
        corrente[1] = new ContaCorrente("002", 1060 ,5000);


        ContaPoupanca poupanca[] = new ContaPoupanca[2];
        poupanca[0] = new ContaPoupanca("001", 1115, 2);
        poupanca[1] = new ContaPoupanca("002", 1116, 50);

        Banco banco = new Banco("Nubank", corrente, poupanca);

        System.out.println(banco);
    }
}