package Chapter12.ProgrammingExercises;
import java.util.*;

// Write an application that throws and catches an ArithmeticException
// when you attempt to take the square root of a negative value.
//
// Prompt the user for an input value and try the Math.sqrt() method on it.
// The application either displays the square root or catches the thrown Exception
// and displays the message Can't take square root of negative number.
public class SqrtException {
    public static void main(String[] args) throws ArithmeticException {
        // Write your code here
        double num, result;
        Scanner keyword = new Scanner(System.in);
        System.out.print("Enter a number >> ");
        num = Integer.parseInt(keyword.nextLine());
        try
        {
            if(num < 0)
                throw(new ArithmeticException());
            result = Math.sqrt(num);
            System.out.println("Result is " + result);
        }
        catch(ArithmeticException error)
        {
            System.out.println("Can't take square root of negative number");
        }
    }
}
