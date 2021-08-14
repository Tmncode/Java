package Chapter07.GameZone;

import java.util.*;

public class RockPaperScissors2 {
    public static void main(String[] args)
    {
        String userPick;
        int computer;
        String computerPick;
        final int LOW = 1;
        final int HIGH = 3;
        final int NUM_GAMES = 10;
        String msg = " ";
        int gameCount = 0;
        int playerWon = 0;
        int tieGames = 0;
        Scanner in = new Scanner(System.in);
        while(gameCount < NUM_GAMES)
        {
            System.out.print("Select Rock, Paper, or Scissors: ");
            userPick = in.nextLine();
            computer = LOW + (int)(Math.random() * HIGH);
            while(!userPick.equals("rock") && !userPick.equals("paper") && !userPick.equals("scissors"))
            {
                userPick = userPick.toLowerCase();
                if(userPick.startsWith("ro"))
                    userPick = "rock";
                else
                if(userPick.startsWith("pa"))
                    userPick = "paper";
                else
                if(userPick.startsWith("sc"))
                    userPick = "scissors";
                System.out.println("You must pick rock, paper or scissors");
            }
            if(computer == 1)
                computerPick = "rock";
            else
            if(computer == 2)
                computerPick = "paper";
            else
                computerPick = "scissors";
            if(userPick.equals(computerPick))
            {
                System.out.println("tie");
                ++tieGames;
            }
            else
            if(userPick.equals("rock"))
                if(computerPick.equals("paper"))
                    msg = "computer";
                else
                {
                    msg = "you";
                    ++playerWon;
                }
            else
            if(userPick.equals("paper"))
                if(computerPick.equals("scissors"))
                    msg = "computer";
                else
                {
                    msg = "you";
                    ++playerWon;
                }
            else
            if(computerPick.equals("rock"))
                msg = "computer";
            else
            {
                msg ="you";
                ++playerWon;
            }
            System.out.println("You picked " +
                    userPick + "\nComputer picked " + computerPick + "\nWinner: " + msg);
            ++gameCount;
        }

        System.out.println("End of " + NUM_GAMES + " games\nYou won " +
                playerWon + " games\nComputer won " + (NUM_GAMES - playerWon - tieGames) +
                " games\nThere were " + tieGames + " tie games");
    }
}
