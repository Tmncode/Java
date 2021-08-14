package Chapter05.GameZone;

import javax.swing.*;

public class RandomGuess2 {
    public static void main(String[] args)
    {
        int guess;
        int result;
        String msg;
        final int LOW = 1;
        final int HIGH = 10;

       do{
           result = LOW + (int)(Math.random() * HIGH);
           guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                   "Try to guess my number between " + LOW + " and " + HIGH));
           if(guess == result)
               msg = "\nRight!";
           else
           if(guess < result)
               msg = "\nYour guess was too low";
           else
               msg = "\nYour guess was too high";
           JOptionPane.showMessageDialog(null,"The number is " + result + msg);
       }while (guess != result);
    }
}
