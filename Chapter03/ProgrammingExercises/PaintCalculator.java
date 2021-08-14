package Chapter03.ProgrammingExercises;
import java.util.Scanner;

public class PaintCalculator {

    private static double area;
    private static double paintPricePerGallon = 32;
    private static double gallons;
    private static double price;

    public static void main (String args[]) {
        // Write your code here
        double length;
        double width;
        double height;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter the room length >> ");
        length = keyboard.nextInt();

        System.out.print("Enter the room width >> ");
        width = keyboard.nextInt();

        System.out.print("Enter the room height >> ");
        height = keyboard.nextInt();

        computeArea(length, width, height);
        System.out.println();
        System.out.println("You will need " + gallons + " gallons");
        System.out.println("The price to paint the room is: $" + price);
    }

    public static double computeArea(double length, double width, double height) {
        // Write your code here
        area = ((length * height) * 2 + (width * height) * 2);
        computeGallons(area);
        price = gallons * paintPricePerGallon;
        return price;
    }
    public static double computeGallons(double area) {
        // Write your code here
        gallons = (int) Math.ceil(area / 350.0);
        return gallons;
    }
}
