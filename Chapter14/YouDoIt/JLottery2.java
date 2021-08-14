package Chapter14.YouDoIt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// In Chapter 5, you created a lottery game application.
//
// Create a similar game using check boxes.
//
// For this game, generate six random numbers, each between 0 and 30 inclusive.
//
// Allow the user to choose six check boxes to play the game.
//
// (Do not allow the user to choose more than six boxes.)
//
// After the player has chosen six numbers, display the randomly selected numbers, the player's numbers, and
// the amount of money the user has won, as follows:
//----------------------------------------
// Matching Numbers            Award ($)
//----------------------------------------
// Three matches               100
//----------------------------------------
// Four matches                10,000
//----------------------------------------
// Five matches                10,000
//----------------------------------------
// Six matches                 1,000,000
//----------------------------------------
// Zero, one, or two matches   0
//----------------------------------------
// Save the file as JLottery2.java.

public class JLottery2 extends JFrame implements ItemListener{
    final int NUM = 31;
    final int PICKS = 6;
    FlowLayout flow = new FlowLayout();
    JLabel greeting = new JLabel
            ("Play the lottery - Select " + PICKS + " numbers");
    Font serifBold = new Font("Serif", Font.BOLD, 20);
    JCheckBox[] choice = new JCheckBox[NUM];
    JLabel[] label = new JLabel[NUM];
    String winningsString = "The winning numbers are: ";
    String youPickedString = "You chose:   ";
    JTextArea outArea = new JTextArea("");
    int x, y;
    int[] ran = new int[PICKS];
    int[] chosen = new int[PICKS];
    int chosenCount = 0;
    int matches = 0;
    int[] winDollars = {0, 0, 0, 100, 10000, 50000, 1000000};
    public JLottery2()
    {
        super("Lottery Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(greeting);
        greeting.setFont(serifBold);
        for(x = 0; x < NUM; ++x)
        {
            choice[x] = new JCheckBox();
            label[x] = new JLabel("       " + x);
            add(label[x]);
            add(choice[x]);
            choice[x].addItemListener(this);
        }

        add(outArea);

        for(x = 0; x < PICKS; ++x)
        {
            ran[x] = (int)Math.floor(Math.random()*NUM);
            for(y = 0; y < x; ++y)
                if(ran[x] == ran[y])
                    --x;
        }
        for(x = 0; x < PICKS; ++x)
        {
            winningsString += ran[x] + "   ";
        }
        // System.out.println(winningsString);
        // Useful while testing

    }
    public static void main(String[] arguments)
    {
        JLottery2 lotFrame = new JLottery2();
        lotFrame.setSize(380,300);
        lotFrame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        Object source = check.getItem();
        if(chosenCount == PICKS)
        {
            for(x= 0; x < NUM; ++x)
            {
                if(source == choice[x])
                    choice[x].setSelected(false);
            }
        }
        else
        {

            for(x= 0; x < NUM; ++x)
            {
                if(source == choice[x])
                {
                    int select = check.getStateChange();
                    if(select == ItemEvent.SELECTED)
                    {
                        chosen[chosenCount] = x;
                        youPickedString += x + "   ";
                        ++chosenCount;
                    }
                }
            }
            if(chosenCount == PICKS)
            {
                for(x = 0; x < PICKS; ++x)
                    for(y = 0; y < PICKS; ++y)
                        if(chosen[x] == ran[y])
                            ++matches;
                outArea.append(winningsString);
                outArea.append("\n");
                outArea.append(youPickedString);
                outArea.append("\nYou matched " + matches + " numbers");
                outArea.append("\nYou win $" + winDollars[matches]);
            }
        }
    }
}
