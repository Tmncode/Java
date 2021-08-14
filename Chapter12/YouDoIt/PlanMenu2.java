package Chapter12.YouDoIt;

import javax.swing.*;

public class PlanMenu2 {
    public static void main(String[] args) {
        Menu2 briefMenu = new Menu2();
        PickMenu2 entree = null;
        String guestChoice = new String();

        // Within the try block, change both references of PickMenu to PickMenu2.
        // Add a catch block after the try block and before the existing catch block.
        // This catch block will catch any thrown MenuExceptions and display their messages.
        // The message will be the name of a menu item, based on the initial the user entered.
        // All other Exception objects, including NumberFormatExceptions and IndexOutOfBoundsExceptions,
        // will fall through to the second catch block and be handled as before.
        try{
            PickMenu2 selection = new PickMenu2(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        // The catch block must immediately follow the try block.
        // When the try block fails, guestChoice will not have a valid value,
        // so recover from the exception by assigning a value to guestChoice within the following catch block:
        catch(Exception error){
            guestChoice = "An invalid selection";
        }
        // After the catch block, the application continues.
        // Use the following code to display the customer’s choice at the end of the PlanMenu application,
        // and then add closing curly braces for the main() method and the class:
        JOptionPane.showMessageDialog(null,
                "You chose " + guestChoice);
    }
}
