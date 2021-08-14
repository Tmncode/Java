package Chapter12.YouDoIt;

import javax.swing.*;

public class Menu2 {
    // Type the following String array for three entrée choices.
    // Also include a String to build the menu that you will display and an integer to hold the numeric equivalent of the selection.
    protected String[] entreeChoices = {"Rosemary Chicken",
            "Beef Wellington", "Maine Lobster"};
    protected char initials[] = new char[entreeChoices.length];
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
    // At the end of the method header for the displayMenu() class, add the following clause:
    public String displayMenu() throws MenuException{
        // Within the displayMenu() method, just before the closing curly brace of the for loop that builds the menu String,
        // add a statement that takes the first character of
        // each element in the entreeChoices array and stores it in a corresponding element of the initials array.
        // At the end of the for loop, the initials array holds the first character of each available entrée.
        for(int x = 0; x < entreeChoices.length; ++x){
            menu = menu + "\n" + (x + 1) + " for " +
                    entreeChoices[x];
            initials[x] = entreeChoices[x].charAt(0);
        }
        // After displaying the JOptionPane dialog box that displays the menu and receives the user’s input,
        // add a loop that compares the first letter of the user’s choice to each of the initials of valid menu options.
        // If a match is found, throw a new instance of the MenuException class that uses the corresponding entrée as its String argument.
        // In other words, when this thrown MenuException is caught by another method,
        // the assumed entrée is the String returned by the getMessage() method.
        // By placing this test before the call to parseInt(), you cause entries of R, B, or M to throw a
        // MenuException before they can cause a NumberFormatException.
        String input = JOptionPane.showInputDialog(null,
                "Type your selection, then press Enter." + menu);
        for(int y = 0; y < entreeChoices.length; ++y)
            if(input.charAt(0) == initials[y])
                throw(new MenuException(entreeChoices[y]));
        choice = Integer.parseInt(input);
        return(entreeChoices[choice - 1]);
    }
}
