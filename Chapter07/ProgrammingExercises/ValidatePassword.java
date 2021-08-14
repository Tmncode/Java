package Chapter07.ProgrammingExercises;

import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        do {
            int upperCount = 0;
            int lowerCount = 0;
            int digitCount = 0;

            //Greeting
            System.out.print("Please enter password: >> ");

            // System in for password
            String password = input.nextLine();

            // Counting the number of each input
            for (int i = 0; i < password.length(); i++){
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z')
                    upperCount++;
                else if (ch >= 'a' && ch <= 'z')
                    lowerCount++;
                else if (ch >= '0' && ch <= '9')
                    digitCount++;
            }

            // Parameter Check
            if (upperCount < 2)
                System.out.println("Password must contain at least two UpperCase letters");
            if (lowerCount < 3)
                System.out.println("Password must contain at least three LowerCase letters");
            if (digitCount < 1)
                System.out.println("Password must contain at least one digits");
                valid = (upperCount >= 2 && lowerCount >= 3 && digitCount >= 1);
            if (valid)
                System.out.println("Valid Password");
        }while(!valid);
    }
}
