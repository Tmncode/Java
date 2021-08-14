package Chapter11.GameZone;
// Create an application that instantiates one object of each game type and demonstrates that the methods work correctly.
// Save the application as PlayCardGames.java.

public class PlayCardGames {
    public static void main(String[] args)
    {
        Poker aGame = new Poker();
        Bridge anotherGame = new Bridge();
        aGame.shuffle();
        aGame.displayDescription();
        aGame.deal();
        System.out.println();
        anotherGame.shuffle();
        anotherGame.displayDescription();
        anotherGame.deal();
    }
}
