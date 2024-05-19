import javax.swing.*;

public class JanelaPrincipal extends JFrame {

    public JanelaPrincipal() {

        setTitle("Minecraft2D - Phillipi Jesus Cardoso");
        setSize(1280, 768);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(new Painel());
        setVisible(true);


        JOptionPane.showMessageDialog(this, "Use do numero 1 ate o numero 4 para selecionar algum bloco.\n\nUse as teclas:\n\nA - para se mover pra esquerda\n\nD - para se mover pra direita\n\nEspaço - para pular \n\nBotao Direito - para quebrar/colocar blocos\n\n");

    }

}
