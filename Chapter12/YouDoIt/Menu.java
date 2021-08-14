package Chapter12.YouDoIt;
import javax.swing.*;

// An advantage to using object-oriented exception-handling techniques
// is that you gain the ability to handle error conditions differently within each program you write.
// Next, you extend the Menu class to create a class named VegetarianMenu. Subsequently,
// when you write an application that uses PickMenu with a VegetarianMenu object,
// you can deal with any thrown exception differently than when you wrote the PlanMenu application.
public class Menu {
    // Type the following String array for three entrée choices.
    // Also include a String to build the menu that you will display and an integer to hold the numeric equivalent of the selection.
    protected String[] entreeChoices = {"Rosemary Chicken",
                                      "Beef Wellington", "Maine Lobster"};
    private String menu = "";
    private int choice;

    // Add the displayMenu() method, which lists each entrée option with a corresponding
    // number the customer can type to make a selection.
    // Even though the allowable entreeChoices array subscripts are 0, 1, and 2,
    // most users would expect to type 1, 2, or 3. So, you code x + 1 rather than x as the number in the prompt.
    // After the user enters a selection, convert it to an integer.
    // Return the String that corresponds to the user’s menu selection—the one with the subscript
    // that is 1 less than the entered value.
    // After the closing curly brace for the displayMenu() method, add the closing curly brace for the class.
    public String displayMenu(){
        for(int x = 0; x < entreeChoices.length; ++x){
            menu = menu + "\n" + (x + 1) + " for " +
                    entreeChoices[x];
        }
        String input = JOptionPane.showInputDialog(null,
                "Type your selection, then press Enter." + menu);
        choice = Integer.parseInt(input);
        return(entreeChoices[choice - 1]);
    }
}
