package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class JobPricing {

    private static double price;

    public static void main(String[] args) {
        String description;
        double materials;
        double hoursOnJob = 35;
        double hoursTraveling = 12;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter job description >> ");
        description = keyboard.nextLine();

        System.out.print("Enter cost of materials >> ");
        materials = keyboard.nextDouble();

        System.out.print("Enter hours on the job work >> ");
        hoursOnJob = keyboard.nextDouble();

        System.out.print("Enter hours traveling >> ");
        hoursTraveling = keyboard.nextDouble();

        computePrice(materials, hoursOnJob, hoursTraveling);
        System.out.println();
        System.out.println("The price for " + description +
                " is $" + price);
    }

    public static double computePrice(double materials, double hoursOnJob, double hoursTraveling) {
        // Write your code here
        price = materials + hoursOnJob * 35 + hoursTraveling * 12;
        return price;
    }
}
