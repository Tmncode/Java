package Chapter14.ProgrammingExercises;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Design an application for the Sublime Sandwich Shop.
//
// The user makes sandwich order choices from list boxes, and the application displays the price.
//
// The user can choose from three main sandwich ingredients: chicken at $6.99, beef at $7.99, tuna at $8.99.
//
// The user also can choose from three different bread types: white, rye, whole wheat at no change in cost.
public class JSandwich extends JFrame implements ItemListener {
    FlowLayout flow = new FlowLayout();
    JLabel companyName = new JLabel("Sublime Sandwich");
    //String[] meatArray = new String[] {"chicken, beef, tuna"};
    JComboBox<String> mainBox = new JComboBox<>();
    JLabel mainList = new JLabel("Main Ingredient:");
    //String[] breadArray = new String[] {"white, rye, whole wheat"};
    JComboBox<String> breadBox = new JComboBox<>();
    JLabel breadList = new JLabel("Bread:");
    JTextField totPrice = new JTextField(10);

    int mainNum, breadNum;
    double[] mainPrices = {6.99, 7.99, 8.99};
    double sumPrice = mainPrices[0];
    double breadPrice = 0;
    double mainPrice = mainPrices[0];
    double[] breadPrices = {0, 0, 0};
    String output;
    public JSandwich() {
        // Write your code here
        super("Sublime Sandwich Shop");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(flow);

        add(companyName);
        companyName.setFont(new Font("Arial", Font.BOLD, 18));

        add(mainList);
        mainList.setFont(new Font("Arial", Font.BOLD, 14));

        add(breadList);
        breadList.setFont(new Font("Arial", Font.BOLD, 14));

        add(totPrice);
        totPrice.setFont(new Font("Arial", Font.BOLD, 14));

        mainBox.addItem("Chicken");
        mainBox.addItem("Beef");
        mainBox.addItem("Tuna");
        add(mainList);
        add(mainBox);
        mainBox.setSelectedIndex(2);
        mainBox.addItemListener(this);

        breadBox.addItem("White");
        breadBox.addItem("Rye");
        breadBox.addItem("Whole Wheat");
        add(breadList);
        add(breadBox);
        breadBox.setSelectedIndex(1);
        breadBox.addItemListener(this);

        add(totPrice);
    }
    public static void main(String[] arguments) {
        JSandwich sandframe = new JSandwich();
        sandframe.setSize(265, 165);
        sandframe.setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent list) {
        // Write your code here
        if(list.getSource() == mainBox){
            mainNum = mainBox.getSelectedIndex();
            mainPrice = mainPrices[mainNum];
            breadNum = breadBox.getSelectedIndex();
            breadPrice = breadPrices[breadNum];
            sumPrice = mainPrice + breadPrice;
            output = "Total price $" + sumPrice;
            totPrice.setText(output);
        }
    }
}
