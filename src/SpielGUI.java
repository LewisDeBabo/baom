import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SpielGUI {
    public Waffenbaum waffenbaum;
    private JButton jaButton;
    private JButton neinButton;
    private JTextArea Frage;


    public SpielGUI() {
        jaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                waffenbaum.ja();
            }
        });
        neinButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                waffenbaum.nein();
            }
        });
    }

    private void createUIComponents() {

    }
}
