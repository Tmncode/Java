package Chapter02.ProgrammingExercises;

import java.util.Scanner;

public class MileConversionsInteractive {
    public static void main(String[] args)
    {
        final double KM_IN_MILE = 1.852;
        final double MILES_IN_MILE = 1.150779;
        double Miles;
        double km;
        double miles;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of nautical miles >> ");
        Miles = input.nextDouble();

        km = Miles * KM_IN_MILE;
        miles = Miles * MILES_IN_MILE;

        System.out.println(Miles + " nautical miles equals " +
                km + " kilometers or " + miles + " miles.");
    }
}
