package Chapter13.YouDoIt;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.*;
import java.io.*;
import java.nio.file.attribute.*;
import static java.nio.file.StandardOpenOption.*;
import java.nio.ByteBuffer.*;
import java.nio.channels.FileChannel.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;
// The program will prompt the user to enter the filename to be used and set up all necessary variables and constants.
//
//A few statistics about the file will be displayed.
//
//The nondefault contents of the file will be displayed sequentially.
//
//A selected record from the file will be accessed directly.
public class ReadStateFile {
    // Start a main() method in which you declare a Scanner object to handle keyboard input.
    // Then declare a String that will hold the name of the file the program will use.
    // Prompt the user for the filename, concatenate it with the correct path, and create a Path object.
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String fileName;
        System.out.print("Enter name of file to use >> ");
        fileName = kb.nextLine();
        fileName = "C:\\Java\\Chapter.13\\" + fileName;
        Path file = Paths.get(fileName);
        // Add the String formatting constants and build a sample record String
        // so that you can determine the record size.
        // To save time, you can copy these declarations from the CreateFilesBasedOnState program.
        final String ID_FORMAT = "000";
        final String NAME_FORMAT = "         ";
        final int NAME_LENGTH = NAME_FORMAT.length();
        final String HOME_STATE = "WI";
        final String BALANCE_FORMAT = "0000.00";
        final String delimiter = " , ";
        String s = ID_FORMAT + delimiter + NAME_FORMAT + delimiter +
                HOME_STATE + delimiter + BALANCE_FORMAT + System.getProperty("line separator");
        final int RECSIZE = s.length();
        // The last set of declarations includes a byte array that you will use with a
        // ByteBuffer later in the program, a String that represents the account number in an empty account,
        // and an array of strings that can hold the pieces of a split record after it is read from the input file.
        // Add a variable for the numeric customer balance, which will be converted from the String stored in the file.
        // Also, declare a total and initialize it to 0 so the total customer balance due value can be accumulated.
        byte[] data = s.getBytes();
        final String EMPTY_ACCT = "000";
        String[] array = new String[4];
        double balance;
        double total = 0;
        // Save the file as ReadStateFile.java.
        // Compile the file and correct any errors.
        // Just before the two closing curly braces you just added to the program,
        // insert a try block in which you declare a BasicFileAttributes object.
        // Then add statements to display the file’s creation time and size.
        // Include a catch block to handle any thrown exceptions.
        try{
            BasicFileAttributes attr = Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("\nAttributes of file:");
            System.out.println("Creation time " + attr.creationTime());
            System.out.println("Size " + attr.size());
        }
        catch(Exception e){
            System.out.println("Error Exception");
        }
        // Save the file, then compile and execute it.
        // When prompted, you can type the name of either the InStateCusts.txt file or
        // the OutOfStateCusts.txt file. You will see the file creation time and the file size.
        // Start a new try…catch pair after the first one ends,
        // but before the two closing curly braces in the program.
        // Declare an InputStream and BufferedReader to handle reading the file.
        try{
            InputStream iStream = new BufferedInputStream(Files.newInputStream(file));
            BufferedReader reader = new BufferedReader(new InputStreamReader(iStream));
            // Display a heading, and then read the first record from the file into a String.
            System.out.println("\nAll non-default record:\n");
            s = reader.readLine();
            // In a loop that continues while there is more data to read,
            // split the String using the comma delimiter. Test the first split element, the account number,
            // and proceed only if it is not “000”. If the record was entered in the previous program,
            // display the split String elements. Add the balance to a running total.
            // As the last action in the loop, read the next record.
            while(s != null){
                array = s.split(delimiter);
                if(!array[0].equals(EMPTY_ACCT)){
                    balance = Double.parseDouble(array[3]);
                    System.out.println("ID #" + array[0] + " " +
                            array[1] + array[2] + " $" + array[3]);
                    total += balance;
                }
                s = reader.readLine();
            }
            // After all the records have been processed, display the total and close the reader.
            // Add a closing curly brace for the try block.
            System.out.println("Total of all balances is $" + total);
            reader.close();
        }
        // Create a catch block to handle any thrown exceptions.
        catch (Exception e){
            System.out.println("Message: " + e);
        }
        // After the closing brace of the last catch block, but before the two final closing braces in the class,
        // add a new try block that declares a FileChannel and ByteBuffer and
        // then prompts the user for and accepts an account to search for in the file.
        try{
            FileChannel fc = (FileChannel)Files.newByteChannel(file, READ);
            ByteBuffer buffer = ByteBuffer.wrap(data);
            int findAcct;
            System.out.print("Enter the account to seek >> ");
            findAcct = kb.nextInt();
            // Calculate the position of the desired record in the file by multiplying the
            // record number by the file size. Read the selected record into the ByteBuffer, and
            // convert the associated byte array to a String that you can display.
            // Add a closing curly brace for the try block.
            fc.position(findAcct * RECSIZE);
            fc.read(buffer);
            s = new String(data);
            System.out.println("Desired record: " + s);
        }
        //Add a catch block to handle any exceptions.
        catch (Exception e){
            System.out.println("Message: " + e);
        }
        // Save the file, and then compile and execute it. Figure 13-43 shows a typical execution.
        // First, the file attributes are displayed, then all the records are displayed,
        // and then a record selected by the user is displayed.
    }
}
