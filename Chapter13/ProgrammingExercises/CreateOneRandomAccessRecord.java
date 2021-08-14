package Chapter13.ProgrammingExercises;
import java.nio.file.*;
import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import static java.nio.file.StandardOpenOption.*;
public class CreateOneRandomAccessRecord {
    public static void main(String[] args) {
        Path file = Paths.get("C:\\Java\\Chapter.13\\RandomEmployees.txt");
        String s = "002, Newmann, 12.25" + System.getProperty("line separator");
        final int RECSIZE = s.length();
        byte[] data = s.getBytes();
        ByteBuffer buffer = ByteBuffer.wrap(data);
        FileChannel fc = null;
        try{
            fc = (FileChannel)Files.newByteChannel(file, READ, WRITE);
            fc.position(2 * RECSIZE); // Because employee number is 2, position is set to 2 times the size of each records
            fc.write(buffer);
            fc.close();
        }
        catch (Exception e){
            System.out.println("Error Message: " + e);
        }
    }
}
