package Chapter03.ProgrammingExercises;

public class NumbersDemo {

    public static void main(String args[])
    {
        int num1 = 5;
        int num2 = 24;

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
    public static void displayTwiceTheNumber(int val)
    {
        System.out.println(val + " times 2 is: " + (2 * val) );
    }
    public static void displayNumberPlusFive(int val)
    {
        System.out.println(val + " plus 5 is: " + (val + 5) );
    }
    public static void displayNumberSquared(int val)
    {
        System.out.println(val + " squared is: " + (val * val) );
    }
}

