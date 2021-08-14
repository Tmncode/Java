package Chapter08.YouDoIt;

import java.util.Scanner;

public class BowlingTeamMain2 {

    public static void main(String[] args) {
        String name;
        int y;
        int x;
        final int NUM_TEAMS = 4;
        final int NUM_TEAM_MEMBER = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        Scanner input = new Scanner(System.in);
        for(y = 0; y < NUM_TEAMS; ++y){
            teams[y] = new BowlingTeam();
            System.out.print("Enter bowling Team name: ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for(x = 0; x < NUM_TEAM_MEMBER; ++x)
            {
                System.out.print("Enter team member's name: ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }

        for(y = 0; y < NUM_TEAMS; ++y){
            System.out.println("\nMembers of team " + teams[y].getTeamName());
            for(x = 0; x < NUM_TEAM_MEMBER; ++x)
                System.out.print(teams[y].getMembers(x) + ", ");
            System.out.println();
        }
    }
}
