package Chapter11.GameZone;
// Create an abstract CardGame class similar to the one described in this chapter.
// The class contains a virtual deck of 52 playing cards that uses a Card class that holds a suit and value for each Card object.
// It also contains an integer field that holds the number of cards dealt to a player in a particular game.
// The class contains a constructor that initializes the deck of cards with appropriate values
// (for example, King of Hearts), and a shuffle() method that randomly arranges the positions of the Cards in the array.
// The class also contains two abstract methods: displayDescription(), which displays a
// brief description of the game in each of the child classes, and deal(),
// which deals the appropriate number of Card objects to one player of a game. Save the file as CardGame.java.

public abstract class CardGame {
    protected final int CARDS_IN_DECK = 52;
    protected final int HIGH_VAL = 13;
    protected final int LOW_VAL = 1;
    protected final int HIGH_SUIT = 4;
    protected Card[] card = new Card[CARDS_IN_DECK];
    int cardsDealt;
    public CardGame()
    {
        int x;
        int suit = 1;
        int value = 1;
        for(x = 0; x < CARDS_IN_DECK; ++x)
        {
            card[x] = new Card();
            if(suit == 1)
                card[x].setSuit("Spades");
            else
            if(suit == 2)
                card[x].setSuit("Hearts");
            else
            if(suit == 3)
                card[x].setSuit("Diamonds");
            else
                card[x].setSuit("Clubs");
            card[x].setValue(value);
            ++value;
            if(value > HIGH_VAL)
            {
                ++suit;
                value = 1;
            }
        }
    }
    public void shuffle()
    {
        Card temp = new Card();
        int x;
        for(x = 0; x < CARDS_IN_DECK; ++x)
        {
            int pos1 = ((int)(Math.random() * 100) % CARDS_IN_DECK);
            int pos2 = ((int)(Math.random() * 100) % CARDS_IN_DECK);
            temp = card[pos1];
            card[pos1] = card[pos2];
            card[pos2] = temp;
        }
        //Display cards when testing program to observe shuffling
        //for(x = 0; x < CARDS_IN_DECK; ++x)
        //{
        //   System.out.println(card[x].getSuit() + " " + card[x].getRank());
        //}
    }
    public abstract void displayDescription();
    public abstract void deal();
}
