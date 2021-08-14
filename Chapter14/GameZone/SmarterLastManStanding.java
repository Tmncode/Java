package Chapter14.GameZone;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

// In the current version of the Last Man Standing game, the computer might seem to make strategic mistakes because
// of its random selections.
//
// For example, when only two JCheckBox objects are left, the computer might randomly choose to check only one,
// allowing the player to check the last one and win.
//
// Modify the game to make it as smart as possible, using a random value for the number of the computer's selections only
// when there is no superior alternative.
//
// Save the improved game as SmarterLastManStanding.java.

public class SmarterLastManStanding extends JFrame implements ItemListener, ActionListener {
    final int BOXES = 10;
    final int MAXCHOICES = 3;
    FlowLayout flow = new FlowLayout();
    JLabel greeting = new JLabel("Select 1, 2 or 3 boxes");
    Font serifBold = new Font("Serif", Font.BOLD, 20);
    JCheckBox[] box = new JCheckBox[BOXES];
    JButton button = new JButton("Done");
    boolean[] isChosen = new boolean[BOXES];
    boolean computersTurn = false;
    int x, y;
    int ran;
    int numChosen;
    public SmarterLastManStanding()
    {
        super("LastManStanding");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(flow);
        add(greeting);
        greeting.setFont(serifBold);
        for(x = 0; x < BOXES; ++x)
        {
            box[x] = new JCheckBox();
            add(box[x]);
            box[x].addItemListener(this);
        }
        add(button);
        button.addActionListener(this);
    }
    public static void main(String[] arguments)
    {
        SmarterLastManStanding frame = new SmarterLastManStanding();
        frame.setSize(300,120);
        frame.setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent check)
    {
        if(!computersTurn)
        {
            Object source = check.getItem();
            for(x = 0; x < BOXES; ++x)
            {
                if(source == box[x])
                {
                    box[x].setSelected(true);
                    if(numChosen < MAXCHOICES)
                    {
                        isChosen[x] = true;
                        ++numChosen;
                    }
                    else
                        box[x].setSelected(false);
                    x = BOXES;
                }
            }
        }
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(allDone())
        {
            String winner = "You win";
            finishUp(winner);
        }
        else
        {
            computersTurn = true;
            int boxesRemaining = howManyFreeBoxes();
            boxesRemaining = boxesRemaining % 4;
            if(boxesRemaining == 1)
                ran = 0;
            else
            if(boxesRemaining == 2)
                ran = 1;
            else
            if(boxesRemaining == 3)
                ran = 2;
            else
                ran = ((int)(Math.random() * 100) % MAXCHOICES);
            for(x = 0; x <= ran; ++x)
            {
                for(y = 0; y < BOXES; ++y)
                {
                    if(!isChosen[y])
                    {
                        isChosen[y] = true;
                        box[y].setSelected(true);
                        y = BOXES;
                    }
                }
            }
            computersTurn = false;
            if(allDone())
            {
                String winner = "Computer wins";
                finishUp(winner);
            }
            numChosen = 0;
        }
    }
    public boolean allDone()
    {
        boolean isDone = true;
        for(x = 0; x < BOXES; ++x)
        {
            if(!isChosen[x])
                isDone = false;
        }
        return isDone;
    }
    public void finishUp(String winner)
    {
        button.setEnabled(false);
        for(x = 0; x < BOXES; ++x)
            remove(box[x]);
        JLabel done = new JLabel("Game over - " + winner);
        add(done);
        validate();
        repaint();
    }
    public int howManyFreeBoxes()
    {
        int count = 0;
        for(x = 0; x < BOXES; ++x)
            if(!isChosen[x])
                ++count;
        return count;
    }
}
