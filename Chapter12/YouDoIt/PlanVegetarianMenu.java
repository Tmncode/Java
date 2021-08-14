package Chapter12.YouDoIt;

import javax.swing.*;

public class PlanVegetarianMenu {
    public static void main(String[] args) {
        // Change the first statement within the main() method as follows so it declares a VegetarianMenu instead of a Menu:
        VegetarianMenu briefMenu = new VegetarianMenu();
        PickMenu entree = null;
        String guestChoice = new String();

        try{
            PickMenu selection = new PickMenu(briefMenu);
            entree = selection;
            guestChoice = entree.getGuestChoice();
        }
        // Change the guestChoice assignment statement in the catch block
        // as follows so it is specific to the program that uses the VegetarianMenu:
        catch(Exception error){
            guestChoice = "An invalid vegetarian selection";
        }
        JOptionPane.showMessageDialog(null,
                "You chose " + guestChoice);
    }
}
