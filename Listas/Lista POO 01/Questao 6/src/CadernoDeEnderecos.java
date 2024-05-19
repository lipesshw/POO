import java.util.Date;

class CadernoDeEnderecos {
    private String nome;
    private String telefone;
    private String email;
    private String dataAniversario;
    private String endereco;

    public CadernoDeEnderecos(String nome, String telefone, String email, String dataAniversario, String endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataAniversario = dataAniversario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}