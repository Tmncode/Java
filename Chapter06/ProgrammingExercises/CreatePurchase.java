package Chapter06.ProgrammingExercises;
import java.util.Scanner;

public class CreatePurchase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Purchase purch = new Purchase();
        int num;
        double amount;
        String entry;
        final int LOW = 1000, HIGH = 8000;
        System.out.print("Enter Invoice number >> ");
        entry = input.next();
        num = Integer.parseInt(entry);

        while(num <= LOW || num >= HIGH)
        {
            System.out.print("Invoice number must be between " +
                    LOW + " and " + HIGH + "\nEnter Invoice number >> ");
            entry = input.next();
            num = Integer.parseInt(entry);
        }

        System.out.print("Enter sale amount >> ");
        entry = input.next();
        amount = Double.parseDouble(entry);
        while(amount < 0)
        {
            System.out.print("Enter sale amount >> ");
            entry = input.next();
            amount = Double.parseDouble(entry);
        }
        purch.setInvoiceNumber(num);
        purch.setSaleAmount(amount);
        purch.display();
    }
}
