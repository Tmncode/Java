package Chapter09.GameZone;

public class Card2 {
    enum Suit {SPADES, HEARTS, DIAMONDS, CLUBS};
    private Suit suit;
    private int value;
    private String rank;
    final int HIGH_VAL = 13;
    final int LOW_VAL = 1;
    final int HIGH = 4;
    public Suit getSuit()
    {
        return suit;
    }
    public int getValue()
    {
        return value;
    }
    public String getRank()
    {
        return rank;
    }
    public void setSuit(Suit s)
    {
        suit = s;
    }
    public void setValue(int v)
    {
        if(v >= LOW_VAL && v <= HIGH_VAL)
            value = v;
        else
            value = LOW_VAL;
        if(value == 1)
            rank = "Ace";
        else
        if(value == 11)
            rank ="Jack";
        else
        if(value == 12)
            rank = "Queen";
        else
        if(value == 13)
            rank = "King";
        else
            rank = Integer.toString(value);
    }
}
