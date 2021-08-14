package Chapter07.ProgrammingExercises;
import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String aString;
        Scanner input = new Scanner(System.in);
        char aChar;
        int count = 0;
        int length;
        boolean previousString = false;
        System.out.print("Enter a string >> ");
        aString = input.nextLine();
        length = aString.length();

        int x;
        for(x = 0; x < length; x++){
            aChar = aString.charAt(x);
            if(aChar == ' ' || aChar == '.' || aChar == ';' || aChar == '!' || aChar == '-' || aChar == '?' ||
                aChar == ','){
                ++count;
                if(previousString)
                    --count;
                previousString = true;
            }
            else
                previousString = false;
        }
        if(!previousString)
            ++count;

        System.out.println("There are " + count + " words in the string");
    }

}
