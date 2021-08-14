package Chapter13.ProgrammingExercises;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
// Write an application that displays the sizes of the files lyric1.txt and lyric2.txt in bytes
// as well as the ratio of their sizes to each other.
public class FileSizeComparison {
    public static void main(String[] args) {
        Path textFile =
                Paths.get("C:\\Java\\Chapter.13\\lyric.txt");
        Path wordFile =
                Paths.get("C:\\Java\\Chapter.13\\lyric.docx");
        // Write your code here
        try
        {
            BasicFileAttributes attrText =
                    Files.readAttributes(textFile, BasicFileAttributes.class);
            BasicFileAttributes attrWord =
                    Files.readAttributes(wordFile, BasicFileAttributes.class);
            long textSize = attrText.size();
            long wordSize = attrWord.size();
            double ratio = textSize * 100.0 / wordSize;
            System.out.println(textFile.toString() + " is " +
                    textSize + " bytes long");
            System.out.println(wordFile.toString() + " is " +
                    wordSize + " bytes long");
            System.out.println("The text file is " +
                    ratio + "% of the size of the Word file");
        }
        catch(IOException e)
        {
            System.out.println("IO Exception");
        }
    }
}
