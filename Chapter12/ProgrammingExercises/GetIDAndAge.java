package Chapter12.ProgrammingExercises;
import java.util.*;

// Create a DataEntryException class whose getMessage() method returns information about invalid integer data.
// Write a program named GetIDAndAge
// that continually prompts the user for an ID number and an age until a terminal 0 is entered for both.
// Throw a DataEntryException if the ID is not in the range of valid ID numbers (0 through 999),
// or if the age is not in the range of valid ages (0 through 119).
// Catch any DataEntryException or InputMismatchException that is thrown, and display an appropriate message.
// Save the files as DataEntryException.java and GetIDAndAge.java.
public class GetIDAndAge {
    public static void main(String[] args)
    {
        int id;
        int age;
        final int QUIT = 0;
        int returnVal = QUIT + 1;
        Scanner keyboard = new Scanner(System.in);
        while(returnVal != QUIT)
        {
            try
            {
                System.out.print("Enter ID ");
                id = keyboard.nextInt();
                System.out.print("Enter age ");
                age = keyboard.nextInt();
                returnVal = check(id, age);
            }
            catch(DataEntryException ex)
            {
                showStatus("Invalid age or ID - " + ex.getMessage());
            }
            catch(InputMismatchException ex)
            {
                showStatus("Invalid data type");
                keyboard.nextLine();
            }
        }
    }
    public static int check(int idNum, int ageNum) throws DataEntryException
    {
        final int HIGHID = 999;
        final int HIGHAGE = 119;
        final int QUIT = 0;
        int returnVal = 1;
        if(idNum < QUIT || idNum > HIGHID)
            throw (new DataEntryException(idNum));
        if(ageNum < QUIT || ageNum > HIGHAGE)
            throw (new DataEntryException(ageNum));
        if(idNum == QUIT && ageNum == QUIT)
            returnVal = QUIT;
        else
        {
            showStatus("ID and Age OK");
        }
        return returnVal;
    }
    public static void showStatus(String msg)
    {
        System.out.println(msg);
    }
}
