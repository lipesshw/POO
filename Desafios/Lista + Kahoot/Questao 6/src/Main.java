import java.util.Date;

public class Main {
    public static void main(String[] args) {
        CadernoDeEnderecos pessoa = new CadernoDeEnderecos("Phillipi Jesus Cardoso", "64 99998-7912", "phillipi.cardoso@discente.ufj.edu.br", "15/05/2024", "Av. 1533 - Vila Sofia");

        System.out.println("\nNome: " + pessoa.getNome());
        System.out.println("Telefone: " + pessoa.getTelefone());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Data de Aniversário: " + pessoa.getDataAniversario());
        System.out.println("Endereço: " + pessoa.getEndereco());

    }
}