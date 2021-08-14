package Chapter13.YouDoIt;
import java.util.Scanner;
import java.nio.file.*;
public class PathDemo2 {
    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a file name >> ");
        name = input.nextLine();
        Path inputPath = Paths.get(name);
        Path fullPath = inputPath.toAbsolutePath();
        System.out.println("full path is " + fullPath.toString());
    }
}
