package Chapter14.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Create an application for Paula’s Portraits, a photography studio.
//
// The application allows users to compute the price of a photography session.
//
// Paula’s base price is $40 for an in-studio photo session with one person.
//
// The in-studio fee is $75 for a session with two or more subjects, and $95 for a session with a pet.
//
// A $90 fee is added to take photos on location instead of in the studio.
//
// Include a set of mutually exclusive check boxes to select the portrait subject and another set for the session location.
//
// Include labels as appropriate to explain the application’s functionality.

public class JPhotoFrame extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JCheckBox locBox = new JCheckBox("On location", false);
    JCheckBox studioBox = new JCheckBox("In studio", false);
    JCheckBox oneBox = new JCheckBox("One human subject          ", false);
    JCheckBox moreBox = new JCheckBox("Two or more human subjects ", false);
    JCheckBox petBox = new JCheckBox("Pet subject                ", false);
    JLabel mainLabel = new JLabel("Paula's Portaits");
    Font font = new Font("Ariel", Font.ITALIC, 24);
    JLabel label2 = new JLabel("Portait fee");
    JLabel label1 = new JLabel("Select options");
    JTextField totPrice = new JTextField(10);
    String output;
    final double LOC_PRICE = 90.00;
    double ONE_HUMAN_SUBJECT_PRICE = 40.00, MORE_HUMAN_SUBJECTS_PRICE = 75.00;
    double PET_SUBJECT_PRICE = 95.00;
    double locPrice = 0.00;
    double subPrice = 0.0;

    public JPhotoFrame(){
        // Write code here
        super("Photography Studio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        ButtonGroup subjectsGroup = new ButtonGroup();
        subjectsGroup.add(oneBox);
        subjectsGroup.add(moreBox);
        subjectsGroup.add(petBox);

        add(label1);
        label1.setFont(new Font("Ariel", Font.ITALIC, 24));

        add(oneBox);
        oneBox.addItemListener(this);
        add(moreBox);
        moreBox.addItemListener(this);
        add(petBox);
        petBox.addItemListener(this);

        ButtonGroup locGroup = new ButtonGroup();
        locGroup.add(locBox);
        locGroup.add(studioBox);

        add(mainLabel);
        mainLabel.setFont(font);

        add(locBox);
        locBox.addItemListener(this);
        add(studioBox);
        studioBox.addItemListener(this);

        add(label2);
        add(totPrice);
        totPrice.setText("$0");
    }
    @Override
    public void itemStateChanged(ItemEvent check) {
        // Write your code here
        Object source = check.getItem();
        int select;
        select = check.getStateChange();
        if(source == locBox)
        {
            if(select == ItemEvent.SELECTED)
                locPrice = locPrice + LOC_PRICE;
            else
                locPrice = locPrice - LOC_PRICE;
        }
        else
        if(source == oneBox)
        {
            if(select == ItemEvent.SELECTED)
                subPrice = subPrice + ONE_HUMAN_SUBJECT_PRICE;
            else
                subPrice = subPrice - ONE_HUMAN_SUBJECT_PRICE;
        }
        else
        if(source == moreBox)
        {
            if(select == ItemEvent.SELECTED)
                subPrice = subPrice + MORE_HUMAN_SUBJECTS_PRICE;
            else
                subPrice = subPrice - MORE_HUMAN_SUBJECTS_PRICE;
        }
        else
        {
            if(source == petBox)
            {
                if(select == ItemEvent.SELECTED)
                    subPrice = subPrice + PET_SUBJECT_PRICE;
                else
                    subPrice = subPrice - PET_SUBJECT_PRICE;
            }
        }
        output = " " + (subPrice + locPrice);
        totPrice.setText(output);
    }
    public static void main(String[] args) {
        JPhotoFrame frame = new JPhotoFrame();
        frame.setSize(250, 280);
        frame.setVisible(true);
    }
}

