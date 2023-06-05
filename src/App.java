import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.desktop.QuitStrategy;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.imageio.ImageIO;
import javax.swing.ComboBoxModel;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException; 

public class App implements ActionListener{

    public static JPanel panel = new JPanel();
    public static JFrame frame = new JFrame();
    public static JLabel title = new JLabel("BinaryBattle");
    public static String teamString = "Team 1: ";
    public static JLabel questionAndAnswer = new JLabel("", SwingConstants.CENTER);
    public static JLabel teams = new JLabel("How many teams?");
    public static ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
    public static ArrayList<String> questionTypes = new ArrayList<>(Arrays.asList("Arrays, ArrayLists, and 2D Arrays", "Conditionals", "Inheritance", "Loops", "Random"));
    public static ArrayList<Integer> questionsArrays = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));
    public static ArrayList<Integer> questionsCond = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));
    public static ArrayList<Integer> questionsInheritance = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));
    public static ArrayList<Integer> questionsLoops = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));
    public static ArrayList<Integer> questionsRandom = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500));
    public static ArrayList<String> teamsList = new ArrayList<>();
    public static ArrayList<Integer> teamScores = new ArrayList<>();
    public static JLabel teamsDisplay = new JLabel("");
    public static JComboBox<ArrayList> myBox1; 
    public static JComboBox<ArrayList> myBox2;
    public static JComboBox<ArrayList> myBox3;
    public static JButton playButton = new JButton("Start Game");
    public static JButton categoryOKButton = new JButton("Select");
    public static JButton viewQButton = new JButton("View Question");
    public static JButton viewAButton = new JButton("View Answer");
    public static JLabel selectTeam = new JLabel("Which team?: ");
    public static JLabel questionType = new JLabel("Select question category: ");
    public static JLabel question = new JLabel("Select point value: ");

    

    public static void main(String[] args) throws Exception {




                
        
        frame.setResizable(false);  
        frame.setSize(1300, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        panel.setLayout(null);

        
        title.setBounds(480, -200, 8000, 600);
        title.setFont(new Font("Calibri", Font.BOLD, 70));
        panel.add(title);

       
  
        
        teams.setBounds(570, -100, 8000, 600);
        teams.setFont(new Font("Calibri", Font.BOLD, 20));
        panel.add(teams);

        selectTeam.setBounds(550, -270, 8000, 600);
        selectTeam.setFont(new Font("Calibri", Font.BOLD, 30));

        questionType.setBounds(500, -120, 8000, 600);
        questionType.setFont(new Font("Calibri", Font.BOLD, 30));

        
        question.setBounds(530, 50, 8000, 600);
        question.setFont(new Font("Calibri", Font.BOLD, 30));

                        
        teamsDisplay.setBounds(170, 510, 8000, 600);
        teamsDisplay.setFont(new Font("Calibri", Font.BOLD, 30));

        

        myBox3 = new JComboBox();
        myBox3.setBounds(570, 50, 150, 50);

        myBox2 = new JComboBox();
        myBox2.setBounds(570, 380, 150, 50);


        myBox1 = new JComboBox(numbers.toArray());
        myBox1.setBounds(550, 220, 200, 50);;
        panel.add(myBox1);

        categoryOKButton.setBounds(590, 280, 100, 20);
        categoryOKButton.setFont(new Font("Calibri", Font.BOLD, 10));
        categoryOKButton.addActionListener(new App());

        viewQButton.setBounds(580, 480, 130, 50);
        viewQButton.addActionListener(new App());

        viewAButton.setBounds(580, 480, 130, 50); //change bounds 
        viewAButton.addActionListener(new App());

        
        playButton.setBounds(550, 350, 200, 100);
        playButton.setFont(new Font("Calibri", Font.BOLD, 30));
        playButton.addActionListener(new App());
        panel.add(playButton);

      

        frame.add(panel);
        frame.setVisible(true);

       

        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == playButton)
        {
            for (int i = 1; i <= (int)myBox1.getSelectedItem(); i++)
            {
                teamsList.add("Team " + i);
            }
            System.out.println(teamsList);


            for (int i = 1; i <= (int)myBox1.getSelectedItem(); i++)
            {
                teamScores.add(0);
            }

            

            myBox3.setModel(new JComboBox(teamsList.toArray()).getModel());

            switchPanels("gs");
        }
        else if (e.getSource() == categoryOKButton)
        {
            if(((String)myBox1.getSelectedItem()).equals("Arrays, ArrayLists, and 2D Arrays"))
            {
              myBox2.removeAllItems();
              myBox2.setModel(new JComboBox(questionsArrays.toArray()).getModel());
              panel.revalidate();
              panel.repaint();
              frame.repaint();
            }
            else if(((String)myBox1.getSelectedItem()).equals("Conditionals"))
            {
              myBox2.removeAllItems();
              myBox2.setModel(new JComboBox(questionsCond.toArray()).getModel());
              panel.revalidate();
              panel.repaint();
              frame.repaint();
            }
            else if(((String)myBox1.getSelectedItem()).equals("Inheritance"))
            {
              myBox2.removeAllItems();
              myBox2.setModel(new JComboBox(questionsInheritance.toArray()).getModel());
              panel.revalidate();
              panel.repaint();
              frame.repaint();
            }
            else if(((String)myBox1.getSelectedItem()).equals("Loops"))
            {
              myBox2.removeAllItems();
              myBox2.setModel(new JComboBox(questionsLoops.toArray()).getModel());
              panel.revalidate();
              panel.repaint();
              frame.repaint();
            }
            else if(((String)myBox1.getSelectedItem()).equals("Random"))
            {
              myBox2.removeAllItems();
              myBox2.setModel(new JComboBox(questionsRandom.toArray()).getModel());
              panel.revalidate();
              panel.repaint();
              frame.repaint();
            }
            
        }
        else if (e.getSource() == viewQButton)
        {

            switchPanels("qs");
        }
        else if (e.getSource() == viewAButton)
        {
            switchPanels("as");
        }
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
            panel.add(myBox3);
            panel.add(selectTeam);
            panel.add(categoryOKButton);
            panel.add(questionType);
            panel.add(viewQButton);
            panel.add(question);
            panel.add(teamsDisplay);
            for (int i = 0; i < teamsList.size(); i++)
            {
                if (i == 0)
                {
                    teamString += teamScores.get(i) + " || ";
                }
                else if (i > 0 && teamsList.size() > 1)
                {
                    teamString += " " + teamsList.get(i) + ": " + teamScores.get(i) + " || ";
                }
            }
            panel.revalidate();
            panel.repaint();
            frame.repaint();

    
        }
        else if (whichScreen.equals("qs"))
        {
            setQuestions(((String)myBox1.getSelectedItem()), ((int)myBox2.getSelectedItem()));
            teamsDisplay.setText(teamString);
            panel.add(viewAButton);
            panel.repaint();
            frame.repaint();
            panel.add(teamsDisplay);
            for (int i = 0; i < teamsList.size(); i++)
            {
                if (i == 0)
                {
                    teamString += teamScores.get(i) + " || ";
                }
                else if (i > 0 && teamsList.size() > 1)
                {
                    teamString += " " + teamsList.get(i) + ": " + teamScores.get(i) + " || ";
                }
            }
            panel.revalidate();
            panel.repaint();
            frame.repaint();
        }
        else if (whichScreen.equals("as"))
        {
            setAnswers(((String)myBox1.getSelectedItem()), ((int)myBox2.getSelectedItem()));
            panel.revalidate();
            panel.repaint();
            frame.repaint();
        }
        
    }


    public void setQuestions(String questionCat, int pointVal)
    {
        if (questionCat.equals("Arrays, ArrayLists, and 2D Arrays"))
        {
            if (pointVal == 100)
            {           
                ImageIcon icon = new ImageIcon("src/Pics/Arrays100Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            
            }
            else if (pointVal == 200)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Arrays200Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 300)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Arrays300Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 400)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Arrays400Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 500)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Arrays500Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }

        }
        else if (questionCat.equals("Conditionals"))
        {
            if (pointVal == 100)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Conditionals100Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 200)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Conditionals200Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 300)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Conditionals300Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 400)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Conditionals400Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 500)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Conditionals500Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
        }
        else if (questionCat.equals("Inheritance"))
        {
            if (pointVal == 100)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance100Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 200)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance200Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 300)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance300Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 400)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance400Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 500)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance500Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
        }
        else if (questionCat.equals("Loops"))
        {
            if (pointVal == 100)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance100Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 200)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance200Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 300)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance300Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 400)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance400Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 500)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Inheritance500Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
        }
        else if (questionCat.equals("Random"))
        {
            if (pointVal == 100)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Random100Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 200)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Random200Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 300)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Random300Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 400)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Random400Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
            else if (pointVal == 500)
            {
                ImageIcon icon = new ImageIcon("src/Pics/Random500Q.png");
                questionAndAnswer.setBounds(0, -30, 1300, 900);
                questionAndAnswer.setIcon(icon);
                panel.add(questionAndAnswer);
                panel.repaint();
                frame.repaint();
            }
        }
    }

    public void setAnswers(String questionCat, int pointVal) {

    }


}