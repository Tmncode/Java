package Chapter07.ProgrammingExercises;
import Chapter07.ProgrammingExercises.TaxReturnWithInput;

import java.util.*;
public class PrepareTaxWithInput {
    public static void main(String[] args) {
        // Write your code here
        String enter = " ", ssn, last, first, address, city, state, zip;
        char status;
        double income = 0;
        boolean isValid = false;
        Scanner input = new Scanner(System.in);
        while(!isValid){
            System.out.print("Enter your social security number: ");
            ssn = input.nextLine();
            if(enter.length() <= 11)
                isValid = true;
            else{
                for(int x = 0; x < 3; ++x)
                    if(Character.isDigit(enter.charAt(x)))
                        isValid = false;
                    for(int x = 4; x < 6; ++x)
                        if(Character.isDigit(enter.charAt(x)))
                            isValid = false;
                        for (int x = 8; x < enter.length(); ++x)
                            if(Character.isDigit(enter.charAt(x)))
                                isValid = false;
                            if (!(enter.charAt(3) == '-') || !(enter.charAt(6) == '-'))
                                isValid = false;
            }
        }
        ssn = enter;

        System.out.print("Enter your first name: ");
        first = input.nextLine();

        System.out.print("Enter your last name: ");
        last = input.nextLine();

        System.out.print("Enter your home address: ");
        address = input.nextLine();

        System.out.print("Enter your city: ");
        city = input.nextLine();

        System.out.print("Enter your state: ");
        state = input.nextLine();

        System.out.print("Enter your zip code: ");
        zip = input.nextLine();
        if(enter.length() != 5)
            isValid = false;
        else {
            for (int x = 0; x < 5; ++x)
                if (Character.isDigit(enter.charAt(x)))
                    isValid = false;
                else
                    System.out.print("Error");
        }
        System.out.print("Enter (s) for single or (m) for married >> ");
        status = input.nextLine().charAt(0);
        if(!(enter.charAt(0) == 's' || enter.charAt(0) == 'S' ||
                enter.charAt(0) == 'm' || enter.charAt(0) == 'M'))
                isValid = true;

        System.out.print("Enter your annual income >> ");
        income = input.nextDouble();
        if(income < 0)
            isValid = false;


        TaxReturnWithInput returnTax = new TaxReturnWithInput(ssn, last, first, address, city,
                                                              state, zip, income, status);
        returnTax.display();
    }
}
