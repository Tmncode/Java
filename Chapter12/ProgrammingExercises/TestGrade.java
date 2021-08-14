package Chapter12.ProgrammingExercises;
import javax.swing.*;

// Write an application that displays a series of at least eight student ID numbers
// (that you have stored in an array) and asks the user to enter a test letter grade for the student.
// Create an Exception class named GradeException that contains a
// static public array of valid grade letters (A, B, C, D, F, and I) that you can use
// to determine whether a grade entered from the application is valid.
// In your application, throw a GradeException if the user does not enter a valid letter grade.
// Catch the GradeException, and then display an appropriate message.
// In addition, store an I (for Incomplete) for any student for whom an exception is caught.
// At the end of the application,
// display all the student IDs and grades. Save the files as GradeException.java and TestGrade.java.
public class TestGrade {
    public static void main(String args[]) throws Exception
    {
        int[] id = {1234, 1245, 1267, 1278, 2345,
                1256, 3456, 3478, 4567, 5678};
        char[] grade = new char[10];
        String gradeString = new String();
        final int HIGHLIMIT = 100;
        String inString, outString = "";
        int flag = 0;
        for(int x = 0; x < id.length; ++x)
        {
            inString = JOptionPane.showInputDialog(null,
                    "Enter letter grade for student id number: " +
                            id[x]);
            grade[x] = inString.charAt(0);
            try
            {
                flag = 0;
                for(int y = 0; y < GradeException.VALID_GRADES.length; ++y)
                {
                    if(grade[x] == GradeException.VALID_GRADES[y])
                        flag = 1;
                }
                if(flag == 0)
                {
                    gradeString = "Invalid grade";
                    throw(new GradeException(gradeString));
                }
            }
            catch(GradeException e)
            {
                JOptionPane.showMessageDialog(null, e.getMessage());
                grade[x] = 'I';
            }
        }
        for(int x = 0; x < id.length; ++x)
            outString = outString + "ID #" + id[x] + "  Grade " +
                    grade[x] + "\n";
        JOptionPane.showMessageDialog(null, outString);
    }
}
