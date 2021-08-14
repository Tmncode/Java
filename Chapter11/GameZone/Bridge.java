package Chapter11.GameZone;
// Create two child classes that extend CardGame.
// You can choose any games you prefer. For example, you might create a Poker class or a Bridge class.
// Create a constructor for each child class that initializes the field that holds the number of cards dealt to the correct value.
// (For example, in standard poker, a player receives 5 cards, but in bridge, a player receives 13.)
// Create an appropriate displayDescription() and deal() method for each child class.
// Save each file using an appropriate name—for example, Poker.java or Bridge.java.

public class Bridge extends CardGame{
    public Bridge()
    {
        super();
        cardsDealt = 13;
    }
    public void displayDescription()
    {
        System.out.println("In bridge, partners bid on how many tricks they will take.");
        System.out.println("The high bid determines a trump suit.");
    }
    public void deal()
    {
        int x;
        System.out.println("Your bridge hand:");
        for(x = 0; x < cardsDealt; ++x)
        {
            System.out.println(card[x].getValue() + " of " + card[x].getSuit());
        }
    }
}
