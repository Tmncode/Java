package Chapter12.ProgrammingExercises;
import java.util.Scanner;
import  java.io.IOException;

// In a “You Do It” section of this chapter,you created a CalculatorDemo program that
// asked the user to solve an arithmetic problem and provided the system calculator for assistance.
//
// Now modify that program to include the following improvements:
//
// Both numbers in the arithmetic problem should be random integers between 1 and 5,000.
//
// The program should ask the user to solve five problems.
//
// The program should handle any nonInteger data entry by displaying an appropriate message and continuing with the next problem.
//
// Save the file as CalculatorDemo2.java.
public class CalculatorDemo2 {
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec
                ("cmd /c C:\\Windows\\System32\\calc.exe");
        final int MAX = 5000;
        final int TIMES = 5;
        int num1;
        int num2;
        int answer;
        int usersAnswer;
        for(int count = 0; count < TIMES; ++ count)
        {
            try
            {
                num1 = 1 + (int)(Math.random() * MAX);
                num2 = 1 + (int)(Math.random() * MAX);
                answer = num1 + num2;
                System.out.print("What is the sum of " + num1 +
                        " and " + num2 + "? >> ");
                usersAnswer = input.nextInt();
                if(usersAnswer == answer)
                    System.out.println("Correct!");
                else
                    System.out.println("Sorry - the answer is " + answer);
            }
            catch (Exception e)
            {
                System.out.print("Invalid answer.");
                if(count < TIMES - 1)
                    System.out.println(" Try again.");
                input.nextLine();
            }
        }
    }
}
