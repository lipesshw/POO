import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Principal extends JFrame implements ActionListener, MouseListener {

    private static JPopupMenu puMenu;
    private static JMenuItem alternarmodo;

    public static void main(String[] args) {

        puMenu = new JPopupMenu();
        alternarmodo = new JMenuItem("Alternar semáforo");
        puMenu.add(alternarmodo);

        JFrame frame = new JFrame();
        Cruzamento cruzamento = new Cruzamento();

        frame.setLayout(new BorderLayout());
        frame.add(cruzamento, BorderLayout.CENTER);

        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        frame.addMouseListener(new Principal());

        alternarmodo.addActionListener(e -> cruzamento.alterarSemaforo());

        new Thread(() -> {
            try {
                cruzamento.SincronizaSemaforo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON3){
            puMenu.show(e.getComponent(), e.getX(), e.getY());
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
