public class Cadastro {

    private int codCliente;
    private String nomeCliente;

    static int codClienteStatic = 0;

    public Cadastro(String nomeCliente) {
        this.codCliente = ++codClienteStatic;
        this.nomeCliente = nomeCliente;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    @Override
    public String toString() {
        return "Cadastro{" + "Codigo: " + codCliente + ", Nome: " + nomeCliente + '}';
    }



}