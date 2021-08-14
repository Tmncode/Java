package Chapter12.YouDoIt;

import javax.swing.*;

// Declare three integers—two to be input by the user and a third to hold the result after dividing the first two.
// The numerator and denominator variables must be assigned starting values because their values will be entered within a try block.
// The compiler understands that a try block might not complete; that is, it might throw an exception before it is through.
// Also declare an input String to hold the return value of the JOptionPane showInputDialog() method.

public class ExceptionDemo2 {
    public static void main(String[] args) {
        int numerator = 0, denominator = 0, result;
        String inputString;

        // Add a try block that prompts the user for two values,
        // converts each entered String to an integer, and divides the values, producing result.
        try{
            inputString = JOptionPane.showInputDialog(null,
                    "Enter a number to be divided");
            numerator = Integer.parseInt(inputString);
            inputString = JOptionPane.showInputDialog(null,
                    "Enter a number to divide into the first number");
            denominator = Integer.parseInt(inputString);
            result = numerator / denominator;
        }
        catch(ArithmeticException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
            result = 0;
        }
        // After the existing catch block that catches an ArithmeticException object,
        // add a catch block that catches a NumberFormatException object if neither user entry can be converted to an integer.
        // If this block executes, display an error message, set numerator and denominator to a default value of 999, and force result to 1.
        catch(NumberFormatException exception){
            JOptionPane.showMessageDialog(null,
                    "This application except digits only!");
            numerator = 999;
            denominator = 999;
            result = 1;
        }

        // Whether the try block succeeds or not, display the result (which might have been set to 0).
        // Include closing curly braces for the main() method and for the class.
        JOptionPane.showMessageDialog(null, numerator + " / " +
                denominator + "\nResult is " + result);
    }
}
