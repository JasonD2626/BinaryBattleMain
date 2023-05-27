import java.awt.Font;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class App {
    public static void main(String[] args) throws Exception {

        JPanel panel = new JPanel();        
        JFrame frame = new JFrame();
        frame.setSize(1300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("BinaryBattle");
        label.setBounds(480, -200, 8000, 600);
        label.setFont(new Font("Calibri", Font.BOLD, 70));
        panel.add(label);

        String[] myArray = {"2", "3", "4", "5", "6", "7"};
        
        final JComboBox<String> myBox = new JComboBox<String>(myArray);
        myBox.setBounds(480, -0, 50, 50);;
        panel.add(myBox);
    }
}