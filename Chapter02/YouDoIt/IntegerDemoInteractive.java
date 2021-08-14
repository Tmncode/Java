package Chapter02.YouDoIt;

import java.util.Scanner;

public class IntegerDemoInteractive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variable or Fields
        String name;
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;

        System.out.print("Please enter an integer >> ");
        anInt = input.nextInt();

        System.out.print("Please enter a byte >> ");
        aByte = input.nextByte();

        System.out.print("Please enter a short >> ");
        aShort = input.nextShort();

        System.out.print("Please enter a long >> ");
        aLong = input.nextLong();

        System.out.print("Please enter your name >> ");
        name = input.nextLine();
        System.out.println("Thamk you, " + name);

        System.out.println("The int is: " + anInt);
        System.out.println("The byte is: " + aByte);
        System.out.println("The short is: " + aShort);
        System.out.println("The long is: " + aLong);

        System.out.println("Int is: " + anInt + " byte is: " + aByte + " short is: " + aShort + " long is: " + aLong);

        int anotherInt = anInt * 1_000_000;
        System.out.println("Another int is: " + anotherInt);

    }
}
