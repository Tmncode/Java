package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class BookStoreCredit {

    public static void main(String args[])
    {

        Scanner studentInput = new Scanner(System.in);
        System.out.print("What is your full name? ");
        String name = studentInput.nextLine();

        System.out.print("What is your grade point average? ");
        double grade = Double.parseDouble(studentInput.nextLine());
        calcCreditAmount(name, grade);


    }
    public static void calcCreditAmount(String name, double a)
    {
        double credit;

        credit = a * 10;
        System.out.println("Your name is " + name + "." + " Your grade point average is " + a + "," + " and your credit earned is: $" + credit);

    }
}
