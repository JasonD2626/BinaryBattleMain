import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {

        JPanel panel = new JPanel();        
        JFrame frame = new JFrame();
        frame.setSize(1500, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("BinaryBattle");
        label.setBounds(10, 20, 8000, 600);
        label.setFont(new Font("Calibri", Font.BOLD, 20));
        panel.add(label);
    }
}