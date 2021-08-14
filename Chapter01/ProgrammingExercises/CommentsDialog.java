package Chapter01.ProgrammingExercises;
import javax.swing.*;

// CommentsDialog.java
// Chapter 1, Exercise #11
// Displays comments in dialog box

public class CommentsDialog {
    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog
                (null, "Program comments are nonExecuting statements you add" +
                        "\nto a program for the purpose of documentation.");
        // line comments
        // Program comments are nonExecuting statements you add
        // to a program for the purpose of documentation.
        // block comment
        /* Program comments are non-executing statements you add
           to a program for the purpose of documentation. */
        // javadoc comment
        /** Programming comments are non-executing statements you add
         to a program for the purpose of documentation  */
    }
}
