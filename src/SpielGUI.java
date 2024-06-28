import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpielGUI extends JFrame{

    Waffenbaum waffenbaum;
    private JButton jaButton;
    private JButton neinButton;
    private JEditorPane frage;
    private JPanel panel1;


    public SpielGUI() {

        jaButton = new JButton("Ja");
        neinButton = new JButton("Nein");
        frage = new JEditorPane();
        panel1 = new JPanel();

        setTitle("RanzGUI");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(700,500);
        setLocationRelativeTo(null);
        setVisible(true);

        panel1.setLayout(null);

        panel1.add(jaButton);
        panel1.add(neinButton);
        panel1.add(frage);


        int frameWidth = 300;
        int frameHeight = 300;
        setSize(frameWidth, frameHeight);
        setTitle("GUI");
        setResizable(false);


        frage.setBounds(80, 64, 120, 32);
        jaButton.setBounds(16, 192, 80, 24);
        neinButton.setBounds(184, 192, 80, 24);


        add(panel1);

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
        new SpielGUI();
    }
}
