import java.awt.Button;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class App implements ActionListener{

    public static JPanel panel = new JPanel();
    public static JFrame frame = new JFrame();
    public static JLabel title = new JLabel("BinaryBattle");
    public static JLabel teams = new JLabel("How many teams?");
    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    public static JComboBox<ArrayList> myBox;
    public static JButton playButton = new JButton("Start Game");
    public static JLabel questionType = new JLabel("Select question type: ");
    

    public static void main(String[] args) throws Exception {

                
        
        frame.setResizable(false);  
        frame.setSize(1300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        panel.setLayout(null);

        
        title.setBounds(480, -200, 8000, 600);
        title.setFont(new Font("Calibri", Font.BOLD, 70));
        panel.add(title);

        
        
       
        
        
        teams.setBounds(570, -100, 8000, 600);
        teams.setFont(new Font("Calibri", Font.BOLD, 20));
        panel.add(teams);

        myBox = new JComboBox(numbers.toArray());
        myBox.setBounds(620, 220, 50, 50);;
        panel.add(myBox);

        
        playButton.setBounds(550, 350, 200, 100);
        playButton.setFont(new Font("Calibri", Font.BOLD, 30));
        playButton.addActionListener(new App());
        panel.add(playButton);

        frame.add(panel);
        frame.setVisible(true);

       

        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switchPanels("gs");
    }

    public void switchPanels(String whichScreen)
    {
        panel.removeAll();
        if (whichScreen.equals("gs"))
        {
           frame.repaint();
        }
    }
}