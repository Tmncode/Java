package Chapter12.ProgrammingExercises;
import java.util.*;

// A company accepts user orders for its products interactively. Users might make the following errors as they enter data:
//
//• The item number ordered is not numeric, too low (less than 0), or too high (more than 9999).
//
//• The quantity is not numeric, too low (less than 1), or too high (more than 12).
//
//• The item number is not a currently valid item.
//
// Although the company might expand in the future, its current inventory consists of the items listed in Table 12-1.

// Create a class that stores an array of usable error messages.
// Create an OrderException class that stores one of the messages.
// Create an application that contains prompts for an item number and quantity.
// Allow for the possibility of nonnumerical entries as well as out-of-range entries
// and entries that do not match any of the currently available item numbers.
// The program should display an appropriate message if an error has occurred.
// The program error messages can be found in the OrderMessages.java file.
// If no errors exist in the entered data, compute the user’s total amount due (quantity times price each) and display it.
public class PlaceAndOrder {
    public static void main(String[] args)
    {
        final int HIGHITEM = 9999;
        final int HIGHQUAN = 12;
        int code = 0;
        int x;
        boolean found;
        final int[] ITEM = {111, 222, 333, 444};
        final double[] PRICE = {0.89, 1.47, 2.43, 5.99};
        int item;
        int quantity;
        double price = 0;
        double totalPrice = 0;
        Scanner input = new Scanner(System.in);

        // write your code here
        try
        {
            code = 0;
            System.out.print("Enter item number ");
            item = input.nextInt();
            code = 1;
            System.out.print("Enter quantity ");
            quantity = input.nextInt();
            code = 2;
            if(item < 0)
                throw (new OrderException(OrderMessages.message[code]));
            code = 3;
            if(item > HIGHITEM)
                throw (new OrderException(OrderMessages.message[code]));
            code = 4;
            if(quantity < 1)
                throw (new OrderException(OrderMessages.message[code]));
            code = 5;
            if(quantity > HIGHQUAN)
                throw (new OrderException(OrderMessages.message[code]));
            found = false;
            for(x = 0; x < ITEM.length; ++x)
                if(item == ITEM[x])
                {
                    found = true;
                    totalPrice = PRICE[x] * quantity;
                    totalPrice *= 100;
                    int temp = (int)totalPrice;
                    totalPrice = temp / 100.0;
                    price = PRICE[x];
                    x = ITEM.length;
                }
            if(found)
            {
                System.out.println("Order OK. Total is $" + totalPrice +
                        "\n  (" + quantity + " at $" + price + " each)");
            }
            else
            {
                code = 6;
                throw (new OrderException(OrderMessages.message[code]));
            }
        }
        catch(InputMismatchException ex)
        {
            System.out.println(OrderMessages.message[code]);
        }
        catch(Exception ex)
        {
            System.out.print("Message is: ");
            System.out.println(ex.getMessage());
        }
    }
}
