import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {
    private int numero;
    private double saldo;
    private boolean ehEspecial;
    private double limite;
     List<Movimentacao> movimentacoes;

    public ContaCorrente(int numero, boolean ehEspecial, double limite) {
        this.numero = numero;
        this.saldo = 0.0;
        this.ehEspecial = ehEspecial;
        this.limite = limite;
        this.movimentacoes = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean ehEspecial() {
        return ehEspecial;
    }

    public double getLimite() {
        return limite;
    }

    public List<Movimentacao> getMovimentacoes() {
        return movimentacoes;
    }

    public void depositar(double valor, String descricao) {
        saldo += valor;
        movimentacoes.add(new Movimentacao(descricao, valor, true));
    }

    public boolean sacar(double valor, String descricao) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            movimentacoes.add(new Movimentacao(descricao, valor, false));
            return true;
        }
        return false;
    }

    public void transferir(ContaCorrente destino, double valor, String descricao) {
        if (this.sacar(valor, "\nTransferência para conta " + destino.getNumero() + " - " + descricao)) {
            destino.depositar(valor, "\nTransferência recebida de conta " + this.getNumero() + " - " + descricao);
        }
    }

    public void emitirExtrato() {
        System.out.println("\nExtrato da conta " + numero);
        for (Movimentacao m : movimentacoes) {
            System.out.println(m);
        }
        System.out.println("Saldo atual: " + saldo);
    }
}
