package Chapter12.YouDoIt;
import javax.swing.*;

// You have created a Menu class that simply holds a list of food items, displays itself,
// and allows the user to make a selection.
// You also created a PickMenu class with fields that hold a user’s specific selection
// from a given menu and methods to get and set values for those fields.
// The PickMenu class might throw exceptions, but it contains no methods that catch those exceptions.
// Next, you write an application that uses the PickMenu class. This application can catch exceptions that PickMenu throws.
public class PlanMenu {
    public static void main(String[] args) {
        // Construct the following Menu named briefMenu, and declare a PickMenu object that you name entree.
        // You do not want to construct a PickMenu object yet
        // because you want to be able to catch the exception that the PickMenu constructor might throw.
        // Therefore, you want to wait and construct the PickMenu object within a try block.
        // For now, you just declare entree and assign it null. Also, you declare a String that holds the customer’s menu selection.
        Menu briefMenu = new Menu();
        PickMenu entree = null;
        String guestChoice = new String();

        // Write the following try block that constructs a PickMenu item.
        // If the construction is successful, the next statement assigns a selection to the entree object.
        // Because entree is a PickMenu object, it has access to the getGuestChoice() method in the PickMenu class,
        // and you can assign the method’s returned value to the guestChoice String.
        try{
            PickMenu selection = new PickMenu(briefMenu);
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

        // The PlanMenu application works well when you enter a valid menu selection.
        // One way that you can force an exception is to enter an invalid menu selection at the prompt.
        // Run the PlanMenu application again, and type 4, A, or any invalid value at the prompt.
        // Entering 4 produces an ArrayIndexOutOfBoundsException, and entering A produces a NumberFormatException.
        // If the program lacked the try…catch pair, either entry would halt the program. However,
        // because the setGuestChoice() method
        // in the PickMenu class throws the exception and the PlanMenu application catches it,
        // guestChoice takes on the value an invalid selection and the application ends smoothly, as shown in Figure 12-46.
    }
}
