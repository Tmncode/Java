package Chapter14.GameZone;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// Create a quiz game that displays, in turn, five questions about any topic of your choice.
//
// All five questions should have the same three possible multiple-choice answers.
//
// For example, you might ask trivia questions about U.S. states for which the correct response is either California,
// Florida, or New York. After each question is displayed, allow the user to choose one, two,
// or all three answers by selecting JCheckBoxes.
//
// In other words, if the user is sure of an answer, he will select just one box, but if he is uncertain,
// he might select two or three boxes. When the user is ready to submit the answer(s), he clicks a button.
//
// If the user's answer to the question is correct and he has selected just one box, award 5 points.
//
// If the user is correct but has selected two boxes, award 2 points.
//
// If the user has selected all three boxes, award 1 point.
//
// If the user has selected fewer than three boxes but is incorrect, the user receives 0 points.
//
// A total of 25 points is possible.
//
// If the user has accumulated more than 21 points at the end of the quiz, display the message Fantastic!
// If the user has accumulated more than 15 points, display the message Very good,
// and if the user has accumulated fewer points, display OK.
//
// Save the file as HedgeYourBet.java.

public class HedgeYourBet extends JFrame implements ItemListener, ActionListener{
    final int QUESTIONS = 5;
    final int CHOICES = 3;
    final int CA = 0;
    final int FL = 1;
    final int NY = 2;
    FlowLayout flow = new FlowLayout();
    JLabel greeting = new JLabel("Quiz - choose 1, 2 or 3 answers");
    Font serifBold = new Font("Serif", Font.BOLD, 20);
    JCheckBox[] choice = new JCheckBox[CHOICES];
    JLabel[] label = new JLabel[CHOICES];
    JTextArea outArea = new JTextArea("");
    int x, y;
    String[] stateName = {"California", "Florida", "New York"};
    String[] question =
            {"    Which state has the oldest cattle ranch in the U.S?",
                    "                            Which state has a bear on its flag?",
                    "                What state's state bird is the mockingbird?",
                    "                   Which state's flower is the golden poppy?",
                    "Which state has the highest number of \nlightening strikes per capita?"};
    int[] answers = {NY, CA, FL, CA, FL};
    int questionNum = 0;
    int numChosen;
    JButton doneButton = new JButton("OK");
    boolean[] isChosen = new boolean[CHOICES];
    int points = 0;
    final int HIGHPOINTS = 5;
    final int MEDPOINTS = 2;
    final int LOWPOINTS = 1;
    String msg = "";
    final int HIGHMARK = 21;
    final int MEDMARK = 15;
    public HedgeYourBet()
    {
        super("Hedge Your Best");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(greeting);
        greeting.setFont(serifBold);
        outArea.setText(question[questionNum]);
        add(outArea);
        for(x = 0; x < CHOICES; ++x)
        {
            choice[x] = new JCheckBox();
            label[x] = new JLabel("       " + stateName[x]);
            add(label[x]);
            add(choice[x]);
            choice[x].addItemListener(this);
        }
        doneButton.addActionListener(this);
        add(doneButton);
    }
    public static void main(String[] arguments)
    {
        HedgeYourBet hFrame = new HedgeYourBet();
        hFrame.setSize(300,300);
        hFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        for(x= 0; x < CHOICES; ++x)
        {
            if(source == choice[x])
            {
                int select = check.getStateChange();
                if(select == ItemEvent.SELECTED)
                    isChosen[x] = true;
                else
                    isChosen[x] = false;
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        //Object source = e.getSource();
        numChosen = 0;
        for(x = 0; x < CHOICES; ++x)
            if(isChosen[x])
                ++numChosen;
        if(isChosen[answers[questionNum]])
        {
            if(numChosen == 1)
                points += HIGHPOINTS;
            else
            if(numChosen == 2)
                points += MEDPOINTS;
            else
            if(numChosen == 3)
                points += LOWPOINTS;
        }
        outArea.setText("\nTotal points earned: " + points);
        ++questionNum;
        if(questionNum == QUESTIONS)
        {
            outArea.append("\nGame over\n");
            doneButton.setEnabled(false);
            if(points > HIGHMARK)
                msg = "Fantastic!";
            else
            if(points >= MEDMARK)
                msg = "Very good";
            else
                msg = "OK";
            outArea.append(msg);
        }
        else
            outArea.append("\n" + question[questionNum]);
    }
}
