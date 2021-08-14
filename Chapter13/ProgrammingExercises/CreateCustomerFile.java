package Chapter13.ProgrammingExercises;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
import java.nio.channels.FileChannel;
// Write a program named CreateCustomer.java that allows you to create a file of customers (Customers.txt)
// for a company. The first part of the program should create an empty file suitable for writing a
// three-digit ID number, six-character last name, and five-digit zip code for each customer.
// The second half of the program accepts user input to populate the file.
// Accept user input until 999 is input for the ID number.
// For this exercise, assume that the user will correctly enter ID numbers and zip codes,
// but force each customer name to six characters, padding it with spaces or truncating it if it is too
// long or too short. Issue an error message, and do not save the records if the user tries to save a record
// with an ID number that already has been used.
//
// Write a program named CreateItemFile.java that creates a file of items carried by the company.
// Include a three-digit item number and up to a 20-character description for each item.
// Issue an error message if the user tries to store an item number that already has been used.
// Accept user input until 999 is input for the item number.
//
// Write an application named CustomerItemOrder.java that takes customer orders.
// Allow a user to enter a customer number and item ordered. Display an error message if the customer number
// does not exist in the customer file or the item does not exist in the item file; otherwise,
// display all the customer information and item information. Accept user input until 999 is input for the
// customer ID number. An example program execution is as follows:
public class CreateCustomerFile {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Path file =
                Paths.get("C:\\Java\\Chapter.13\\Customers.txt");
        String s = "000,      ,00000" + System.getProperty("line.separator");
        String delimiter = ",";
        String[] array = new String[3];
        byte data[] = s.getBytes();
        ByteBuffer buffer;
        FileChannel fc;
        final int RECSIZE = s.length();
        final int NUMRECS = 1000;
        final String QUIT = "999";
        String custString;
        int custNum;
        String name;
        String zipCode;
        String fileNum;
        try
        {
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            for(int count = 0; count < NUMRECS; ++count)
                writer.write(s, 0, s.length());
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("Error message: " + e);
        }
        try
        {
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);

            System.out.print("Enter customer number or " + QUIT + " to quit >> ");
            custString = input.nextLine();
            while(!(custString.equals(QUIT)))
            {
                custNum = Integer.parseInt(custString);
                buffer = ByteBuffer.wrap(data);
                fc.position(custNum * RECSIZE);
                fc.read(buffer);
                s = new String(data);
                array = s.split(delimiter);
                fileNum = array[0];
                //if(!(fileNum.equals("000")))
                //    System.out.println("Sorry - customer " + custString + " already exists");
                //else
                //{
                    System.out.print("Enter name for customer #" + custNum + " >> ");
                    name = input.nextLine();
                    StringBuilder sb = new StringBuilder(name);
                    sb.append("      ");
                    sb.setLength(6);
                    name = sb.toString();
                    System.out.print("Enter zip code >> ");
                    zipCode = input.nextLine();
                    s = custString + delimiter + name + delimiter + zipCode + System.getProperty("line.separator");
                    data = s.getBytes();
                    buffer = ByteBuffer.wrap(data);
                    fc.position(custNum * RECSIZE);
                    fc.write(buffer);
                //}

                System.out.print("Enter next customer number or " + QUIT + " to quit >> ");
                custString = input.nextLine();
            }
            fc.close();
        }
        catch (Exception e)
        {
            System.out.println("Error message: " + e);
        }
    }
}
