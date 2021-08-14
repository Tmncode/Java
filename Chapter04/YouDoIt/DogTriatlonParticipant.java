package Chapter04.YouDoIt;

public class DogTriatlonParticipant {

    private final int NUM_EVENTS;
    private int totalCumulativeScore = 0;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public  DogTriatlonParticipant(String name, int numEvents, int Score1, int Score2, int Score3){
        this.name = name;
        NUM_EVENTS = numEvents;
        obedienceScore = Score1;
        conformationScore = Score2;
        agilityScore = Score3;

        total = obedienceScore + conformationScore +agilityScore;
        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

    public void display(){
        System.out.println(name + " participated in " + NUM_EVENTS  + " events and had a score of " + avg);
        System.out.println(" " + name + " has a total score of " + total + " bring the cumulative score to " + totalCumulativeScore);
        System.out.println();
    }

}
