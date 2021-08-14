package Chapter07.ProgrammingExercises;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String phrase;
        String message1 = "You entered a palindrome";
        String message2 = "You did not enter a palindrome";
        int i;
        int midPoint;
        int stringLength;
        char first;
        char last;
        boolean isPalindrome = true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string >> ");
        phrase = input.nextLine();
        stringLength = phrase.length();

        midPoint = stringLength / 2;
        i = stringLength - 1;
        int j = 0;
        while(j <= midPoint){
            first = Character.toLowerCase(phrase.charAt(j));
            last = Character.toLowerCase(phrase.charAt(i));
            if(first != ' ' && last != ' '){
                if(first != last){
                    isPalindrome = false;
                    j = midPoint;
                }
                --i;
                ++j;
            }
            else
                if(first == ' ')
                    ++j;
                else
                    --i;
        }
        if(isPalindrome)
            System.out.println(message1);
        else
            System.out.println(message2);
    }
}
