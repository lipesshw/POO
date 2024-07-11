import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaCorrente> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void criarConta(int numero, boolean ehEspecial, double limite) {
        contas.add(new ContaCorrente(numero, ehEspecial, limite));
    }

    public void excluirConta(int numero) {
        contas.removeIf(conta -> conta.getNumero() == numero);
    }

    public ContaCorrente buscarConta(int numero) {
        for (ContaCorrente conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }

    public void saque(int numero, double valor, String descricao) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            if (!conta.sacar(valor, descricao)) {
                System.out.println("\nSaque não realizado. Saldo insuficiente.");
            }
        } else {
            System.out.println("\nConta não encontrada.");
        }
    }

    public void deposito(int numero, double valor, String descricao) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            conta.depositar(valor, descricao);
        } else {
            System.out.println("\nConta não encontrada.");
        }
    }

    public void emitirSaldo(int numero) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            System.out.println("\nSaldo da conta " + numero + ": " + conta.getSaldo());
        } else {
            System.out.println("\nConta não encontrada.");
        }
    }

    public void emitirExtrato(int numero) {
        ContaCorrente conta = buscarConta(numero);
        if (conta != null) {
            conta.emitirExtrato();
        } else {
            System.out.println("\nConta não encontrada.");
        }
    }

    public void transferir(int numeroOrigem, int numeroDestino, double valor, String descricao) {
        ContaCorrente contaOrigem = buscarConta(numeroOrigem);
        ContaCorrente contaDestino = buscarConta(numeroDestino);
        if (contaOrigem != null && contaDestino != null) {
            contaOrigem.transferir(contaDestino, valor, descricao);
        } else {
            System.out.println("\nConta origem ou destino não encontrada.");
        }
    }
}