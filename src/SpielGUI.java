import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.Normalizer;

public class SpielGUI extends JFrame{

    Waffenbaum waffenbaum;
    private JButton jaButton;
    private JButton neinButton;
    private JTextArea frage;
    private JPanel panel1;


    public SpielGUI() {
        JFrame frame = new JFrame("RanzGUI");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(700,500);
        frame.setVisible(true);

        frame.add(jaButton);
        frame.add(neinButton);
        frame.add(frage);

        jaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        neinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public void createUIComponents() {

    }

    public static void main(String[] args) {
        SpielGUI gui = new SpielGUI();
    }
}
