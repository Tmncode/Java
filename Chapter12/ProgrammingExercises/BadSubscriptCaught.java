package Chapter12.ProgrammingExercises;
import java.util.*;
// Write an application in which you declare an array of eight first names.
// Write a try block in which you prompt the user for an integer and display the name in the requested position.
// Create a catch block that catches the potential ArrayIndexOutOfBoundsException thrown
// when the user enters a number that is out of range.
// The catch block also should display the error message Subscript out of range.

public class BadSubscriptCaught {
    public static void main(String[] args) {
        String[] names = {"Ariel", "Brad", "Clifford", "Denise", "Emily",
                "Fred", "Gina", "Henry"};
        Scanner keyboard = new Scanner(System.in);
        int number;

        // your code here
        try
        {
            System.out.println("Enter a number, to display the name in the requested position ");
            number = Integer.parseInt(keyboard.nextLine());
            System.out.println("Name is " + names[number]);
        }
        catch(ArrayIndexOutOfBoundsException error)
        {
            System.out.println("Subscript out of range.");
        }
    }
}
