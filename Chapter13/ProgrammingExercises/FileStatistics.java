package Chapter13.ProgrammingExercises;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
// Write an application that displays the name, containing folder, size,
// and time of last modification for the file FileStatistics.java.
// Your program should utilize the getFileName(), readAttributes(), size(), and creationTime() methods.
public class FileStatistics {
    public static void main(String[] args) {
        Path file =
                Paths.get("C:\\Java\\Chapter.13\\TestData.txt");
        // Write your code here
        try
        {
            int count = file.getNameCount();
            System.out.println("Path is " + file.toString());
            System.out.println("File name is " + file.getFileName());
            System.out.println("Folder name is " + file.getName(count - 2));
            BasicFileAttributes attr =
                    Files.readAttributes(file, BasicFileAttributes.class);
            System.out.println("File's size is " + attr.size());
            FileTime time = attr.creationTime();
            System.out.println("File's creation time is " + time);
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
