package Chapter14.YouDoIt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CheckBoxDemonstration extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel label = new JLabel("What would you like to drink?");
    JCheckBox coffee = new JCheckBox("Coffee", false);
    JCheckBox cola = new JCheckBox("Cola", false);
    JCheckBox milk = new JCheckBox("Milk", false);
    JCheckBox water = new JCheckBox("Water", false);
    JCheckBox tea = new JCheckBox("Tea", false);
    public CheckBoxDemonstration(){
        super("Check box Demonstration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label.setFont(new Font("Arial", Font.ITALIC, 22));
        coffee.addItemListener(this);
        cola.addItemListener(this);
        milk.addItemListener(this);
        water.addItemListener(this);
        tea.addItemListener(this);
        add(label);
        add(coffee);
        add(cola);
        add(milk);
        add(water);
        add(tea);
    }
    @Override
    public void itemStateChanged(ItemEvent check){
        Object source = check.getSource();
        int select = check.getStateChange();
        if(source == coffee){
            if(select == ItemEvent.SELECTED)
                // statement that execute when the box is check
                System.out.println("Thank you for choosing coffee today");
            else
                // statement that execute when the box is uncheck
                System.out.println("select a drink");
        }
        else if(source == cola){
            if(select == ItemEvent.SELECTED)
                System.out.println("Thank you for choosing cola today");
            else
                System.out.println("Select a drink");
        }
        else if(source == milk){
            if(select == ItemEvent.SELECTED)
                System.out.println("Thank you for choosing milk today");
            else
                System.out.println("Select a drink");
        }
        else if(source == water){
            if(select  == ItemEvent.SELECTED)
                System.out.println("Thank you for choosing water today");
            else
                System.out.println("Select a drink");
        }
        else if(source == tea){
            if(select == ItemEvent.SELECTED)
                System.out.println("Thank you for choosing tea today");
            else
                System.out.println("Select a drink");
        }
        else {
            // statements that execute when the source of the event is
            // some components other then the checkbox object.
            System.out.println("Error you must select one of the drink to continue");
        }
    }
    public static void main(String[] args){
        final int FRAME_WIDTH = 350;
        final int FRAME_HEIGHT = 150;
        CheckBoxDemonstration frame = new CheckBoxDemonstration();
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setVisible(true);
    }
}
