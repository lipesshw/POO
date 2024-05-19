public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        banco.criarConta(1, true, 500);
        banco.criarConta(2, false, 0);

        banco.deposito(1, 1000, "Depósito inicial");
        banco.saque(1, 200, "Saque para despesas");
        banco.transferir(1, 2, 300, "Pagamento de serviço\n");

        banco.emitirSaldo(1);
        banco.emitirExtrato(1);

        banco.emitirSaldo(2);
        banco.emitirExtrato(2);
    }
}