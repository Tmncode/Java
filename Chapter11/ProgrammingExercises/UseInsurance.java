package Chapter11.ProgrammingExercises;
import javax.swing.*;
// Write an application named UseInsurance that uses an abstract Insurance class and Health and Life
// subclasses to display different types of insurance policies and the cost per month.
// Write an application named UseInsurance that prompts the user for the type of insurance to be displayed,
// and then create the appropriate object. Save the files as Life.java, Health.java, Insurance.java, and UseInsurance.java.

public class UseInsurance {
    public static void main(String args[])
    {
        int insurance;
        String input = JOptionPane.showInputDialog(null, "Enter 1 for Life Insurance or 2 for Health Insurance");
        insurance = Integer.parseInt(input);

        if(insurance == 1)
            insuranceLife();
        else
            insuranceHealth();
    }
    public static void insuranceLife()
    {
        Life life = new Life();
        life.display();
    }
    public static void insuranceHealth()
    {
        Health health = new Health();
        health.display();
    }
}
