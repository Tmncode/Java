package Chapter14.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// The application JFacts contains a JFrame, a label, and six random facts. Every time the user clicks the JButton,
// remove and replace the label's text and add a different one.
//
// The facts should cycle in order, fact 1 to fact 6.
//
// When the JButton is pressed on face 6, the program should display fact 1 again.

public class JFacts extends JFrame implements ActionListener{
    FlowLayout flow = new FlowLayout();

    JButton b = new JButton("Press to change fact");

    JLabel stars = new JLabel("**********************************************");
    JLabel fact = new JLabel("A Tale of Two Cities is a novel set during the French Revolution.       ");

    String[] quotes = new String[]{
            "Only seven prisoners were in the Bastille when it was stormed.          ",
            "A Tale of Two Cities is a novel set during the French Revolution.       ",
            "Perhaps 40,000 people were executed at the guillotine.                  ",
            "A loaf of bread cost a weeks wages prior to the French Revolution.      ",
            "Thomas Jefferson was the U.S. Minister to France during the Revolution. ",
            "Protestant and Jewish religions were illegal in France before 1879.     ",
    };

    //JLabel f1 = new JLabel("A Tale of Two Cities is a novel set during the French Revolution.      ");
    //JLabel f2 = new JLabel("Only seven prisoners were in the Bastille when it was stormed.      ");
    //JLabel f3 = new JLabel("Perhaps 40,000 people were executed at the guillotine.                  ");
    //JLabel f4 = new JLabel("A loaf of bread cost a weeks wages prior to the French Revolution.      ");
    //JLabel f5 = new JLabel("Thomas Jefferson was the U.S. Minister to France during the Revolution. ");
    //JLabel f6 = new JLabel("Protestant and Jewish religions were illegal in France before 1879.     ");

    int counter = 0;

    public JFacts() {
        // Write your code here
        super("Facts");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);
        add(b);
        add(stars);
        add(fact);
        //add(f1);
        b.addActionListener(this);

    }

    public static void main(String[] args) {
        JFacts rFrame = new JFacts();
        rFrame.setSize(440, 100);
        rFrame.setVisible(true);

        //for(int i = 0; i < 6; ++i){
        //    if(!rFrame.fact.getText().equals(rFrame.quotes[i])){
        //        System.err.print("\n" + rFrame.quotes[i] + "\n" +
        //                rFrame.fact.getText());
        //    }
        //    rFrame.b.doClick();
        //}
        //System.exit(0);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Write your code here
        fact.setText(quotes[counter]);
        if(counter < quotes.length - 1){
            ++counter;
        }
        else{
            counter = 0;
        }
        //++counter;
        //if(counter == 6)
        //    counter = 0;
        //if(counter == 1)
        //{
        //    remove(f1);
        //    add(f2);
        //}
        //else
        //if(counter == 2)
        //{
        //    remove(f2);
        //    add(f3);
        //}
        //else
        //if(counter == 3)
        //{
        //    remove(f3);
        //    add(f4);
        //}
        //else
        //if(counter == 4)
        //{
        //    remove(f4);
        //    add(f5);
        //}
        //else
        //if(counter == 5)
        //{
        //    remove(f5);
        //    add(f6);
        //}
        //else
        //{
        //    remove(f6);
        //    add(f1);
        //}
        //validate();
        //repaint();
    }
}
