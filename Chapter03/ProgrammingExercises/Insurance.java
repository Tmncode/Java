package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class Insurance {

    private static int multiNum = 20;
    private static int addNum  = 15;

    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year ");
        int currentYear = Integer.parseInt(input.nextLine());

        System.out.print("What is your birth year? ");
        int birthYear = Integer.parseInt(input.nextLine());

        calcPremium(currentYear, birthYear);
        input.close();
    }

    private static void calcPremium(int currentYear, int birthYear)
    {
        int premium = 0;
        int decade  = 0;
        int age = currentYear - birthYear;

        decade = age;
        premium = (decade + addNum) * multiNum;

        System.out.println("Your Insurance premium is: $" + premium);

    }
}
