package Chapter12.YouDoIt;

import javax.swing.*;

// Change the class name to PickMenu2, and change the declaration of the Menu object to a Menu2 object.
// Change the constructor name to PickMenu2 and its argument to type Menu2.
// Also add a throws clause to the PickMenu2 constructor header so that it throws a MenuException.
// This constructor does not throw an exception directly, but it calls the setGuestChoice() method,
// which calls the displayMenu() method, which throws a MenuException.
public class PickMenu2 {
    private Menu2 briefMenu;
    private String guestChoice = new String();

    public PickMenu2(Menu2 theMenu) throws MenuException{
        briefMenu = theMenu;
        setGuestChoice();
    }

    // The following setGuestChoice() method displays the menu and reads keyboard data entry
    // (so the method throws an exception). It also displays instructions and then retrieves the user’s selection.
    // Add the following throws clause to the setGuestChoice() method header:
    public void setGuestChoice() throws MenuException{
        JOptionPane.showMessageDialog(null,
                "Choose from the following menu:");
        guestChoice = briefMenu.displayMenu();
    }

    // Add the following getGuestChoice() method that returns a guest’s String selection from the PickMenu class.
    // Also, add a closing curly brace for the class.
    public String getGuestChoice(){
        return(guestChoice);
    }
}
