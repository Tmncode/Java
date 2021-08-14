package Chapter13.CaseProblems;
import java.io.*;
import java.nio.file.*;
import static java.nio.file.StandardOpenOption.*;
import java.util.Scanner;
public class WriteEmployeeFile {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Path file = Paths.get("C:\\Java\\Chapter.13\\Employees.txt");
        String s = "";
        String delimiter = " , ";
        int id;
        String name;
        double payRate;
        final int QUIT = 999;
        try{
            OutputStream output = new
                    BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new
                    BufferedWriter(new OutputStreamWriter(output)); // BufferedWriter object is declared.
            System.out.print("Enter employee ID number >> ");
            id = input.nextInt();
            while(id != QUIT){
                System.out.print("Enter name of employee #" + id + " >> ");
                input.nextLine();
                name = input.nextLine();
                System.out.print("Enter pay rate >> ");
                payRate = input.nextDouble();
                s = id + delimiter + name + delimiter + payRate;
                writer.write(s, 0, s.length()); // BufferedWriter object uses write() method.
                writer.newLine();
                System.out.print("Enter next ID number or " + QUIT + " to quit >> ");
                id = input.nextInt();
            }
            writer.close();
        }
        catch(Exception e){
            System.out.println("Message: " + e);
        }
    }
}
