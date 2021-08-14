package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class NumberDemo2 {

    public static void main(String[] args)
    {
        int num1 = 0;
        int num2 = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        num1 = keyboard.nextInt();

        System.out.print("Enter second integer: ");
        num2 = keyboard.nextInt();

        System.out.println();
        //System.out.println("*** Integer #1: " + num1);
        displayTwiceTheNumber(num1);
        displayNumberPlusFive(num1);
        displayNumberSquared(num1);
        System.out.println();
        //System.out.println("*** Integer #2: " + num2);
        displayTwiceTheNumber(num2);
        displayNumberPlusFive(num2);
        displayNumberSquared(num2);
    }
    public static int displayTwiceTheNumber(int val)
    {
        System.out.println(val + " times 2 is: " + (2 * val) );
        return val;
    }
    public static int displayNumberPlusFive(int val)
    {
        System.out.println(val + " plus 5 is: " + (val + 5) );
        return val;
    }
    public static int displayNumberSquared(int val)
    {
        System.out.println(val + " squared is: " + (val * val) );
        return val;
    }
}
