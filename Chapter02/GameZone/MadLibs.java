package Chapter02.GameZone;

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter noun: ");
        String noun = userInput.nextLine();

        System.out.print("Enter plural noun: ");
        String pluralNoun = userInput.nextLine();

        System.out.print("Enter a adjective: ");
        String adjective = userInput.nextLine();

        System.out.print("Enter a verb: ");
        String verb = userInput.nextLine();

        System.out.println();
        System.out.println("Mary had a little " + noun);
        System.out.println("Its " + pluralNoun + " was " + adjective + " as snow");
        System.out.println("And everywhere that Mary " + verb);
        System.out.println("The " + noun + " was sure to go.");

    }
}
