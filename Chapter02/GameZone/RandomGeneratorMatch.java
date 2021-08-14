package Chapter02.GameZone;

import java.util.Scanner;

public class RandomGeneratorMatch {

    public static void main(String[] args) {

        int randomNumber;
        randomNumber = (int) (Math.random() * 10 + 1);

        // Display the random number
        System.out.println("Secret number is " + randomNumber);

        Scanner userInput = new Scanner(System.in);
        int guess;
        do {
            System.out.print("Enter a number from 1 - 10: ");
            guess = userInput.nextInt();

            System.out.println();
            System.out.println("Your guess is " + guess);
            if (guess == randomNumber)
                System.out.println("Your guess is correct. Congratulations!");
            else if (guess < randomNumber)
                System.out.println("Your guess is smaller than the secret number.");
            else if (guess > randomNumber)
                System.out.println("Your guess is greater than the secret number.");
        }
        while (guess != randomNumber);
    }
}
