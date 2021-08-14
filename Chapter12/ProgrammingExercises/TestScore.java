package Chapter12.ProgrammingExercises;
import javax.swing.*;

// Write an application that displays a series of at least five student ID numbers (that you have stored in an array)
// and asks the user to enter a numeric test score for the student.
// Create a ScoreException class,
// and throw a ScoreException for the class if the user does not enter a valid score (less than or equal to 100).
// Catch the ScoreException, display an appropriate message, and then store a 0 for the student’s score.
// At the end of the application, display all the student IDs and scores.
// Save the files as ScoreException.java and TestScore.java.
public class TestScore {
    public static void main(String args[]) throws Exception
    {
        int[] id = {1234, 2345, 3456, 4567, 5678};
        int[] score = {0, 0, 0, 0, 0};
        String scoreString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        for(int x = 0; x < id.length; ++x)
        {
            inString = JOptionPane.showInputDialog(null,
                    "Enter score for student id number: " + id[x]);
            score[x] = Integer.parseInt(inString);
            try
            {
                if(score[x] > HIGHLIMIT)
                {
                    scoreString = "Score over " + HIGHLIMIT;
                    throw (new ScoreException(scoreString));
                }
            }
            catch(ScoreException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
                score[x] = 0;
            }
        }
        for(int x = 0; x < id.length; ++x)
            outString = outString + "ID #" + id[x] + "  Score " +
                    score[x] + "\n";
        JOptionPane.showMessageDialog(null, outString);
    }
}
