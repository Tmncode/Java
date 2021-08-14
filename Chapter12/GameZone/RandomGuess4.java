package Chapter12.GameZone;
import javax.swing.JOptionPane;  // or import javax.swing.*;

// In Chapter 1, you created a class called RandomGuess.
// In this game, the application generates a random number for a player to guess.
// In Chapter 5, you improved the application to display a message indicating whether
// the player’s guess was correct, too high, or too low.
//
// In Chapter 6, you further improved the game by adding a loop that
// continually prompts the user to enter the correct value,if necessary.
//
// As written, the game should work as long as the player enters numeric guesses.
// The game throws an exception, however, if the player enters a letter or other nonNumeric character.
// Discover the type of Exception thrown,
// then improve the game by handling the exception
// so that the user is informed about the error and allowed to attempt to enter the correct data again.
// Save the file as RandomGuess4.java.
public class RandomGuess4 {
    public static void main(String[] args)
    {
        int guess = 0;
        int result;
        String msg;
        int attempts = 1;
        final int LOW = 1;
        final int HIGH = 10;
        boolean ok = false;
        result = LOW + (int)(Math.random() * HIGH);
        while(!ok)
        {
            try
            {
                guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Try to guess my number between " + LOW + " and " + HIGH));
                ok = true;
            }
            catch(NumberFormatException e)
            {
                JOptionPane.showMessageDialog(null,
                        "Input must be a number");
                ok = false;
            }
        }
        while(guess != result)
        {
            if(guess < result)
                msg = "Your guess was too low";
            else
                msg = "Your guess was too high";
            guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                    msg + "\nGuess again"));
            ++attempts;
        }
        JOptionPane.showMessageDialog(null,
                "Correct! You got it in " + attempts + " attempts");
    }
}
