package Chapter10.ProgrammingExercises;
import java.util.*;

public class Person {
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    public void setData()
    {
        // write your code here
        System.out.print("Please enter first name >> ");
        firstName = input.nextLine();
        System.out.print("Please enter last name >> ");
        lastName = input.nextLine();
        System.out.print("Please enter street address >> ");
        address = input.nextLine();
        System.out.print("Please enter zip code >> ");
        zip = input.nextLine();
        System.out.print("Please enter telephone number >> ");
        phone = input.nextLine();
    }
    public void display()
    {
        // write your code here
        System.out.println(firstName + " " + lastName +
                " " + address + " " + zip + " " + phone);
    }
}
