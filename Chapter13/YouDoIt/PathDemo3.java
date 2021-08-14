package Chapter13.YouDoIt;
import java.nio.file.*;
import java.io.IOException;
import static java.nio.file.AccessMode.*;

public class PathDemo3 {
    public static void main(String[] args) {
        Path filePath =
                Paths.get("C:\\JavaPrograms\\Chapter13\\PathDemo.class");
        System.out.println("Full path is " + filePath.toString());
        try{
            filePath.getFileSystem().provider().checkAccess(filePath, READ, EXECUTE);
            System.out.println("File can be read and execute");
        }
        catch(IOException e){
            System.out.println("File cannot be use for this application");
        }
    }
}
