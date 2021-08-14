package Chapter02.ProgrammingExercises;

import java.util.Scanner;

public class ChiliToGo {
    public static void main(String[] args)
    {
        final double ADULT_PRICE = 7;
        final double KID_PRICE = 4;

        int adultMeals;
        int kidMeals;
        double totalAdult, totalKid, grandTotal;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of adult meals ordered >> ");
        adultMeals = input.nextInt();

        System.out.print("Enter number of child meals ordered >> ");
        kidMeals = input.nextInt();

        totalAdult = adultMeals * ADULT_PRICE;
        totalKid = kidMeals * KID_PRICE;
        grandTotal = totalAdult + totalKid;

        System.out.println(adultMeals + " adult meals were ordered at " + ADULT_PRICE + " each.");
        System.out.println("      Total is " + totalAdult);

        System.out.println(kidMeals + " child meals were ordered at " + KID_PRICE + " each.");
        System.out.println("      Total is " + totalKid);

        System.out.println("Grand total for all meals is " + grandTotal);
    }
}
