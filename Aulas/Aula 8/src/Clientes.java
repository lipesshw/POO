
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Clientes {

    static List<Cadastro>clientes = new ArrayList<Cadastro>();

    static void inserirCliente(String nome){
        Cadastro c = new Cadastro(nome);
        clientes.add(c);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){
            inserirCliente(JOptionPane.showInputDialog("Nome: "));
        }
        for(Cadastro cliente: clientes){
            JOptionPane.showMessageDialog(null, cliente);
        }

        System.out.println(clientes);

        //metodo anteriormente aprendido para instanciar um objeto
//    Cadastro c1 = new Cadastro("Phillipi");
//    Cadastro c2 = new Cadastro("Lucas");
//    Cadastro c3 = new Cadastro("Gustavo");
//
//    System.out.println(c1);
//    System.out.println(c2);
//    System.out.println(c3);


    }

}
