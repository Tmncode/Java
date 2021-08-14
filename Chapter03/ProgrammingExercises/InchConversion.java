package Chapter03.ProgrammingExercises;

import java.util.Scanner;

public class InchConversion
{
    public static void main(String[] args) {
        float inches;
        float feet;

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of inches >> ");
        inches = keyboard.nextFloat();

        System.out.print("Enter the number of feet >> ");
        feet = keyboard.nextFloat();

        float numberOfFoot = inches / 12;

        System.out.println();
        System.out.println(inches + " inches is " + numberOfFoot + " foot");
        System.out.println(feet + " feet is " + numberOfFoot + " yards");

    }
}
