package Chapter11.GameZone;
// Create two child classes that extend CardGame. You can choose any games you prefer.
// For example, you might create a Poker class or a Bridge class.
// Create a constructor for each child class that initializes the field that holds the number of cards dealt to the correct value.
// (For example, in standard poker, a player receives 5 cards, but in bridge, a player receives 13.)
// Create an appropriate displayDescription() and deal() method for each child class.
// Save each file using an appropriate name—for example, Poker.java or Bridge.java.

public class Poker extends CardGame{
    public Poker()
    {
        super();
        cardsDealt = 5;
    }
    public void displayDescription()
    {
        System.out.println("In poker, players bet on hands.");
        System.out.println("Winner can bluff or must have highest hand if called.");
    }
    public void deal()
    {
        int x;
        System.out.println("Your poker hand:");
        for(x = 0; x < cardsDealt; ++x)
        {
            System.out.println(card[x].getValue() + " of " + card[x].getSuit());
        }
    }
}
