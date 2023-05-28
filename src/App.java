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
    public static ArrayList<String> questionTypes = new ArrayList<>(Arrays.asList("good morning", "b", "c", "d", "e"));
    public static ArrayList<String> questions = new ArrayList<>(Arrays.asList("f", "g", "h", "i", "j"));
    public static JComboBox<ArrayList> myBox1;
    public static JComboBox<ArrayList> myBox2;
    public static JButton playButton = new JButton("Start Game");
    public static JButton categoryOKButton = new JButton("OK!");
    public static JLabel questionType = new JLabel("Select question category: ");
    public static JLabel question = new JLabel("Select question: ");
    

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

        questionType.setBounds(500, -120, 8000, 600);
        questionType.setFont(new Font("Calibri", Font.BOLD, 30));

        question.setBounds(550, 50, 8000, 600);
        question.setFont(new Font("Calibri", Font.BOLD, 30));

        myBox2 = new JComboBox(questions.toArray());
        myBox2.setBounds(570, 380, 150, 50);


        myBox1 = new JComboBox(numbers.toArray());
        myBox1.setBounds(570, 220, 150, 50);;
        panel.add(myBox1);

        
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
            myBox1.removeAllItems();
            myBox1.setModel(new JComboBox(questionTypes.toArray()).getModel());
            panel.add(myBox2);
            panel.add(myBox1);
            panel.add(questionType);
            panel.add(question);
            panel.revalidate();
            panel.repaint();
            frame.repaint();

   
        }
        
    }

    public void setQuestions(String whichQuestion)
    {
        if (whichQuestion.equals("a"))
        {
            myBox1.removeAllItems();
        }
    }


}