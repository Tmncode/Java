package Chapter12.YouDoIt;
import java.util.Scanner;
import java.io.IOException;

// In this section, you create a program that asks a user to complete a simple arithmetic problem
// and displays the Windows calculator to help the user.
//
// Open a new file, and then enter the following import statements,
// class header, and opening curly brace for the CalculatorDemo class:
public class CalculatorDemo {
    // Create the main() method header.
    // The method throws an IOException because it will use the Runtime exec() method and not handle the exception the method throws.
    public static void main(String[] args) throws IOException{
        // Declare a Scanner object for input and a Process object that invokes the built-in calculator program named calc.exe.
        Scanner input = new Scanner(System.in);
        Process proc = Runtime.getRuntime().exec("cmd /c C:\\Windows\\System32\\calc.exe");

        // Declare some values to be used in an arithmetic problem.
        // Also declare a variable to hold the sum of the two numbers and another variable to hold the user’s answer.
        double num1 = 279.6;
        double num2 = 872.8;
        double answer = num1 + num2;
        double userAnswer;

        // Prompt the user for an answer, accept it, and then display an appropriate message.
        // Include a closing curly brace for the main() method and another for the class.
        System.out.print("What is the sum of " +
                num1 + " and " + num2 + "? >> ");
        userAnswer = input.nextDouble();
        if (userAnswer == answer)
            System.out.println("Correct!!");
        else
            System.out.println("Sorry - the answer is " + answer);
    }
}
