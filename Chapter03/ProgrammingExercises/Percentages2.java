package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class Percentages2 {

    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Input the first number you wish to compare >> ");
        double percent1 = Double.parseDouble(keyboard.nextLine());

        System.out.print("Input the second number you wish to compare >> ");
        double percent2 = Double.parseDouble(keyboard.nextLine());

        System.out.println();
        System.out.println(percent1 + " is " + computePercent(percent1, percent2) + " percent" + " of " + percent2);
        System.out.println(percent2 + " is " + computePercent(percent2, percent1) + " percent" + " of " + percent1);


    }
    public static double computePercent(double p1, double p2)
    {
        double cal;
        cal = Math.floor((p1 / p2) * 100);
        return cal;
    }
}
