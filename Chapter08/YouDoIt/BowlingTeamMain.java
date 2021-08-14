package Chapter08.YouDoIt;
import java.util.*;

public class BowlingTeamMain {
    public static void main(String[] args) {
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int x;
        final int NUM_TEAM_MEMBER = 4;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your bowling Team name: ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);
        for(x = 0; x < NUM_TEAM_MEMBER; ++x)
        {
            System.out.print("Enter team member name: ");
            name = input.nextLine();
            bowlTeam.setMember(x, name);
        }

        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBER; ++x)
            System.out.println(bowlTeam.getMembers(x) + " ");
        System.out.println();
    }
}
