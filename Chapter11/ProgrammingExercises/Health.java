package Chapter11.ProgrammingExercises;
// The Health class sets the monthly fee to $196.

import javax.swing.*;
public class Health extends Insurance{
    public Health()
    {
        super("Health");
        setCost();
    }
    public void setCost()
    {
        cost = 196;
    }
    public void display()
    {
        JOptionPane.showMessageDialog(null," " + type +
                " insurance costs $" + cost + " per month");
    }
}
