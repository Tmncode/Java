package Chapter05.YouDoIt;

public class DogTriatlonParticipant2 {
    private final int NUM_EVENTS;
    private int totalCumulativeScore = 0;
    private boolean doScoresAgree;

    private String name;
    private int obedienceScore;
    private int conformationScore;
    private int agilityScore;
    private int total;
    private double avg;

    public  DogTriatlonParticipant2(String name, int numEvents, int Score1, int Score2, int Score3){
        this.name = name;
        NUM_EVENTS = numEvents;

        int totalNot0 = 0;
        if(Score1 != 0)
            totalNot0 = totalNot0 + 1;
        if(Score2 != 0)
            totalNot0 = totalNot0 + 1;
        if(Score3 != 0)
            totalNot0 = totalNot0 + 1;


        if(numEvents == totalNot0)
            doScoresAgree = true;
        else
            doScoresAgree = false;

        if(doScoresAgree){
            obedienceScore = Score1;
            conformationScore = Score2;
            agilityScore = Score3;
        }
        else{
            obedienceScore = 0;
            conformationScore = 0;
            agilityScore = 0;
        }

        total = obedienceScore + conformationScore + agilityScore;
        if(NUM_EVENTS == 0)
            avg = 0;
        else
            avg = (double) total / NUM_EVENTS;

        avg = (double) total / NUM_EVENTS;
        totalCumulativeScore = totalCumulativeScore + total;
    }

    public void display(){

        if(!doScoresAgree)
            System.out.println("\nNotice! Number of events for " + name + " does not agree with scores reported");
        System.out.println(name + " participated in " + NUM_EVENTS  + " events and had a score of " + avg);
        System.out.println("  " + name + " has a total score of " + total + " bring the cumulative score to " + totalCumulativeScore);
        System.out.println();
    }
}
