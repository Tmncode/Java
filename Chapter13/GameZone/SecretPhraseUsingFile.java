package Chapter13.GameZone;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// In several Game Zone assignments earlier in this book,
// you created games similar to Hangman in which the user guesses a secret phrase
// by selecting a series of letters.
//
// These versions had limited appeal because each contained only a few possible phrases to guess;
// after playing the games a few times, the user would have memorized all the phrases.
//
// Now create a version in which any number of secret phrases can be saved to a file before the game is played.
//
// Use a text editor such as Notepad to type any number of phrases into a file, one per line.
// Save the file as Phrases.txt. Then,
// create a game that randomly selects a phrase from the file and
// allows a user to guess the phrase letter by letter. Save the game as SecretPhraseUsingFile.java.
public class SecretPhraseUsingFile {
    public static void main(String[] args)
    {
        Path file =  Paths.get("C:\\Java\\Chapter.13\\Phrases.txt");
        InputStream input;
        String s = "";
        StringBuilder displayPhrase = new StringBuilder();
        String prompt;
        String play = "Play our game - guess the phrase\n";
        String enterOne = "Enter one letter\n";
        String sorry = "Sorry - not in the phrase: ";
        String correct = "Correct! ";
        String userResponse;
        char guess;
        char letter;
        boolean found;
        int position;
        int x;
        int random = 0;
        int count = 0;
        final int LEN;
        x = 0;
        try
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            while(s != null)
            {
                ++count;
                s= reader.readLine();
            }
            random = (int) (Math.random() * 100) % count;
            input.close();
        }
        catch (Exception e)
        {
            System.out.println("Error Message" + e);
        }

        try
        {
            input = Files.newInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            int numRead = 0;
            while(numRead < random)
            {
                ++numRead;
                s = reader.readLine();
            }
            input.close();
        }
        catch (Exception e)
        {
            System.out.println("Error Message" + e);
        }
        assert s != null;
        s = s.toLowerCase();
        LEN = s.length();
        while(x < LEN)
        {
            if(s.charAt(x) == ' ')
                displayPhrase.append(' ');
            else
                displayPhrase.append("*");
            ++x;
        }
        prompt = play + enterOne;
        while(displayPhrase.toString().indexOf('*') != -1)
        {
            userResponse =  JOptionPane.showInputDialog(null, prompt +
                    displayPhrase);
            userResponse = userResponse.toLowerCase();
            guess = userResponse.charAt(0);
            found = false;
            for(position = 0; position < LEN; ++position)
            {
                letter = s.charAt(position);
                if(letter == guess)
                {
                    displayPhrase = new StringBuilder(displayPhrase.substring(0, position) +
                            guess + displayPhrase.substring(position + 1, LEN));
                    found = true;
                }
            }
            if(!found)
            {
                prompt = sorry + guess + '\n';
            }
            else
            {
                prompt = correct + enterOne;
            }
        }
        JOptionPane.showMessageDialog(null, "Congratulations!\nThe phrase was:\n" +
                s);
    }
}
