
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Interface extends JFrame implements ActionListener{

    //atributos graficos da tela
    private JPanel pnDados, pnBotoes;
    private JLabel lbCodico, lbNome;
    private JTextField tfCodigo, tfNome;
    private JButton btNovo, btMostrar, btSair, btInserir;
    private Container tela;

    private List<Cadastro> clientes = new ArrayList<>();

    private Cadastro cadastro = new Cadastro();

    Interface(){

        //Criação do que vai conter na tela
        tela = this.getContentPane();
        tela.setLayout(new BorderLayout());

        //Instanciar Paineis
        pnDados = new JPanel();
        pnBotoes = new JPanel();

        //Adicionar paineis na tela
        tela.add(pnDados, BorderLayout.CENTER);
        tela.add(pnBotoes, BorderLayout.SOUTH);

        //mudar o fundo do painel
        pnBotoes.setBackground(Color.GRAY);

        //Configurando componentes
        lbCodico = new JLabel("Código do Cliente:");
        lbCodico.setBackground(Color.WHITE);
        lbNome = new JLabel("Nome do Cliente:");

        tfCodigo = new JTextField(10);
        tfNome = new JTextField(30);

        btNovo = new JButton("Novo");
        btInserir = new JButton("Inserir");
        btMostrar = new JButton("Mostrar");
        btSair = new JButton("Sair");

        pnDados.setLayout(new GridLayout(2,2));
        pnDados.setBackground(Color.WHITE);
        pnDados.setBackground(new java.awt.Color(36, 36, 36));

        pnDados.setBorder(
                BorderFactory.createTitledBorder("Dados Pessoais")
        );

        lbCodico.setForeground(Color.RED);


        pnDados.add(lbCodico);
        pnDados.add(tfCodigo);

        pnDados.add(lbNome);
        pnDados.add(tfNome);

        pnBotoes.setLayout(new GridLayout(1,4));

        pnBotoes.add(btNovo);
        pnBotoes.add(btInserir);
        pnBotoes.add(btMostrar);
        pnBotoes.add(btSair);

        //Evento dos botoes
        btSair.addActionListener(this);
        btMostrar.addActionListener(this);
        btNovo.addActionListener(this);
        btInserir.addActionListener(this);

        //impede o usuário a alterar o campo Código Cliente
        tfCodigo.setEditable(false);

        //Criação da tela
        this.setTitle("Cadastro de Clientes");
        this.setSize(600,150);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    private void inserirClientes(){
        clientes.add(cadastro);
    }

    private void mostrarCliente(Cadastro cadastro){
        for(Cadastro cliente: clientes){
            JOptionPane.showMessageDialog(null, cliente);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //quem realiza a ação
        if(e.getSource() == btSair){
            System.exit(0);
        }
        if(e.getSource() == btNovo){
            tfCodigo.setText("");
            tfNome.setText("");
        }
        if(e.getSource() == btMostrar){
            mostrarCliente(cadastro);
        }
        if(e.getSource() == btInserir){
            tfCodigo.setText(Integer.toString(cadastro.getCodCliente()));
            JOptionPane.showMessageDialog(null, "Cadastro feito com sucesso");
            cadastro = new Cadastro(tfNome.getText());
            inserirClientes();
        }
    }
}