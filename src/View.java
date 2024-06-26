import javax.swing.*;
public class View extends JFrame {
    public View() {
        setTitle("BTree GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        new View();
    }
}