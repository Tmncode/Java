package Chapter13.GameZone;

import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Use a text editor to create a comma-delimited file of user IDs and passwords.
//
// Revise any one of the games you have created throughout this book so the user must first
// enter a correct ID and its associated password before playing. Save the program as GameWithPassword.java.
public class GameWithPassword {
    public static void main(String[] args)
    {
        Path file =
                Paths.get("C:\\Java\\Chapter.13\\GamePlayers.txt");
        String userId;
        String password;
        String s;
        String delimiter = ",";
        String[] array = new String[2];
        boolean isOK = false;
        int guess;
        int result;
        String msg;
        int attempts = 1;
        final int LOW = 1;
        final int HIGH = 10;
        result = LOW + (int)(Math.random() * HIGH);
        userId = JOptionPane.showInputDialog(null, "Enter your user ID");
        password = JOptionPane.showInputDialog(null, "Enter your password");
        try
        {
            InputStream input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();

            while(s != null)
            {
                array = s.split(delimiter);
                if(array[0].equals(userId) && array[1].equals(password))
                    isOK = true;
                s = reader.readLine();
            }
            reader.close();
        }
        catch(Exception e)
        {
            System.out.println("Message: " + e);
        }
        if(!isOK)
        {
            JOptionPane.showMessageDialog(null, "Sorry - your ID or password was invalid");
        }
        else
        {
            guess = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Try to guess my number between " + LOW + " and " + HIGH));
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
            JOptionPane.showMessageDialog(null,"Correct! You got it in " +
                    attempts + " attempts");
        }
    }
}
