public class Banco {

    public String nome;
    public ContaCorrente contaCorrente[];
    public ContaPoupanca contaPoupanca[];

    public Banco(String nome, ContaCorrente[] contaCorrente, ContaPoupanca[] contaPoupanca) {
        this.nome = nome;
        this.contaCorrente = contaCorrente;
        this.contaPoupanca = contaPoupanca;
    }

    public String getNome() {
        return nome;
    }

    public ContaCorrente[] getContaCorrente() {
        return contaCorrente;
    }

    public ContaPoupanca[] getContaPoupanca() {
        return contaPoupanca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setContaCorrente(ContaCorrente[] contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public void setContaPoupanca(ContaPoupanca[] contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    @Override
    public String toString() {
        String correnteStr = "", poupancaStr = "";
        for(int i = 0;i< contaCorrente.length;i++){
            correnteStr = correnteStr +" "+contaCorrente[i].toString();
        }

        for(int i = 0;i< contaPoupanca.length;i++){
            poupancaStr = poupancaStr +" "+contaPoupanca[i].toString();
        }

        return "Banco{" + "nome = " + nome + "\ncontasCorrente=" + correnteStr + "\ncontasPoupanca=" + poupancaStr + '}';
    }

}

    
class Conta{
    String agencia;
    int numero;
    float saldo;

    public Conta(String agencia, int numero, float saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    public String getAgencia() {

        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}

class ContaCorrente extends Conta{
    public ContaCorrente(String agencia, int numero, float saldo) {
        super(agencia, numero, saldo);
    }
}

class ContaPoupanca extends Conta{
    public ContaPoupanca(String agencia, int numero, float saldo) {
        super(agencia, numero, saldo);
    }
}
