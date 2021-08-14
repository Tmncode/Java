package Chapter04.ProgrammingExercises;

public class TestGame {

    public static void main(String[] args)
    {
        Team team1 = new Team("Roosevelt High", "Girls Basketball", "Dolphins");
        Team team2 = new Team("Hoover High", "Girls Basketball", "Tigers");
        Game game1 = new Game(team1, team2, "7 PM");

        System.out.println("The game between " + team1.getName() + "" + team1.getSport() +
                "" + team1.getMascot());
        System.out.println(" and " + team2.getName() + "" + team2.getSport() +
                "" + team2.getMascot());
        System.out.println(" takes place at " + game1.getTime());
    }
}
