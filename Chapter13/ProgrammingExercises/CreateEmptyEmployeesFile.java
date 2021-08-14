package Chapter13.ProgrammingExercises;
import java.nio.file.*;
import java.io.*;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateEmptyEmployeesFile {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Java\\Chapter.13\\RandomEmployees.txt");
        // String that represents a default record, The three digits employee numbers is set to zeros,
        // The name is set to seven blanks , The payRate is set to 00.00,
        // The String ends with the System's line separator value.
        String s = "000,        , 00.00" + System.getProperty("line.separator");
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        final int NUMRECS = 1000;
        try{
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            for(int count = 0; count < NUMRECS; ++count) // Loop that writes 1000 default records
                writer.write(s, 0, s.length());
            writer.close();
        }
        catch(Exception e){
            System.out.println("Error Message: " + e);
        }
    }
}
