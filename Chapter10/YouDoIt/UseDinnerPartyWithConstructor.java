package Chapter10.YouDoIt;

import java.util.*;

public class UseDinnerPartyWithConstructor {
    public static void main(String[] args) {
        int guests;
        int choice;

        PartyWithConstructor2 aPartyWithConstructor2 = new PartyWithConstructor2();
        DinnerPartyWithConstructor2 aDinnerPartyWithConstructor2 = new DinnerPartyWithConstructor2();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of guess for the party >> ");
        guests = keyboard.nextInt();

        aPartyWithConstructor2.setGuests(guests);
        aDinnerPartyWithConstructor2.setGuests(guests);

        System.out.print("Enter the menu option -- 1 for chicken or 2 for beef >> ");
        choice = keyboard.nextInt();
        aDinnerPartyWithConstructor2.setDinnerChoice(choice);

        System.out.println("The party has " + aPartyWithConstructor2.getGuests() + " guests");
        System.out.println("The dinner party has " + aDinnerPartyWithConstructor2.getGuests() + " guests");

        System.out.println("Menu option " + aDinnerPartyWithConstructor2.getDinnerChoice() + " will be served");

        aPartyWithConstructor2.displayInvitation();
        aDinnerPartyWithConstructor2.displayInvitation();

    }
}
