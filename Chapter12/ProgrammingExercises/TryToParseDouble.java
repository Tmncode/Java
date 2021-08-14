package Chapter12.ProgrammingExercises;
import java.util.*;

// The Double.parseDouble() method requires a String argument,
// but it fails if the String cannot be converted to a floating-point number.
//
// Write an application in which you try accepting a double input from a user and catch a NumberFormatException if one is thrown.
// The catch block forces the number to 0 and displays Value entered cannot be converted to a floating-point number.
// Following the catch block, display the number.
public class TryToParseDouble {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double num;
        try
        {
            System.out.print("Enter a floating point number >> ");
            num = Double.parseDouble(keyboard.nextLine());
        }
        catch(NumberFormatException error)
        {
            num = 0;
            System.out.println("Value entered cannot be converted to a floating-point number");
        }
        System.out.println("Number is " + num);
    }
}
