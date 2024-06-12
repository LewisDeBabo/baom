import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SpielGUI extends JFrame{
    public Waffenbaum waffenbaum;
    private JButton jaButton = new JButton();
    private JButton neinButton = new JButton();
    private JTextArea Frage = new JTextArea();


    public SpielGUI() {

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

    public void (){

    }
    private void createUIComponents() {

    }
}
