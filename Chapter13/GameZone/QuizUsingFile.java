package Chapter13.GameZone;

import javax.swing.*;
import java.nio.file.*;
import java.io.*;

import static java.nio.file.StandardOpenOption.*;

// In Chapter 8, you created a game named Quiz in which the user could respond to multiple-choice questions.
//
// Modify the game so that it stores the player’s highest score from any previous game in a file and
// displays the high score at the start of each new game.
//
// (The first time you play the game, the high score is 0.) Save the game as QuizUsingFile.java.
public class QuizUsingFile {
    public static void main(String[] args)
    {
        Path file =  Paths.get("C:\\Java\\Chapter.13\\Scores.txt");
        String[] questions =
                {"How  many players on a basketball team?\nA. 5  B. 6  C. 7",
                        "How many points for a basket?\nA. 1   B. 2  C. 3",
                        "How many points for a free throw?\nA. 1  B. 2  C. 3",
                        "You can earn three points when you\nA. Make any basket\n" +
                                "B. Throw from inside the three-point line\n" +
                                "C. Throw from outside the three-point line",
                        "What is the full name of Chicago's NBA team?\n" +
                                "A. Bulls  B. Bears  C. Cubs",
                        "Who may ask a referee about a rule interpretation?\n" +
                                "A. Team captain\n" +
                                "B. A player who receives a foul\n" +
                                "C. Any player on the floor",
                        "Suppose a shooter from team A makes a basket\n" +
                                "in team B's basket. Who gets credit for the basket?\n" +
                                "A. The player who made the basket\n" +
                                "B. The last player from team B who made a basket\n" +
                                "C. The player from team B nearest the shooter",
                        "A basketball game starts with a\n" +
                                "A. Jump ball\nB. Throw in from the side\n" +
                                "C. Throw in from the end",
                        "Bouncing a ball while walking or running is\n" +
                                "A. Slobbering  B. Dribbling  C. Dabbling",
                        "Taking steps with the ball without dribbling is called\n" +
                                "\nA. Stepping  B. Dunking  C. Travelling"};

        char[] answers = {'A', 'B', 'A', 'C', 'A', 'A', 'C', 'A', 'B', 'C' };
        char ans = ' ';
        int x, correct = 0;
        int score;
        int previousCorrect;
        String entry;
        String s = "0";
        boolean isGood;
        InputStream input;
        OutputStream output;
        try
        {
            input = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            s = reader.readLine();
            System.out.println(s);
            input.close();
        }
        catch (IOException e)
        {
            System.out.println("Error Message" + e);
        }
        assert s != null;
        score = Integer.parseInt(s);
        JOptionPane.showMessageDialog(null, "The previous high score is " + score);
        for(x = 0; x < questions.length; ++x)
        {
            isGood = false;
            int firstError = 0;
            while(!isGood)
            {
                isGood = true;
                entry = JOptionPane.showInputDialog(null,questions[x]);
                ans = entry.charAt(0);
                if(ans != 'A' && ans != 'B' && ans != 'C')
                {
                    isGood = false;
                    if(firstError == 0)
                    {
                        questions[x] = questions[x] +
                                "\nYour answer must be A, B or C.";
                        firstError = 1;
                    }
                }
            }
            if(ans == answers[x])
            {
                ++correct;
                JOptionPane.showMessageDialog(null, "Correct!");
            }
            else
                JOptionPane.showMessageDialog(null, "The correct answer is " +
                        answers[x]);
        }
        previousCorrect = score;
        JOptionPane.showMessageDialog(null, "You got " +
                correct + " right and\n" +(questions.length - correct) +
                " wrong");
        if(correct > previousCorrect)
            s = "" + correct;
        else
            s = "" + previousCorrect;
        byte[] data = s.getBytes();
        try
        {
            output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            output.write(data);
            output.flush();
            output.close();
        }
        catch(Exception e)
        {
            System.out.println("Error Message");
        }
    }
}
