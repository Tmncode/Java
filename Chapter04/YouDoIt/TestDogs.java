package Chapter04.YouDoIt;

public class TestDogs {
    public static void main(String[] args) {

        DogTriatlonParticipant dog1 = new DogTriatlonParticipant("Bowser", 2, 85, 89, 0);
        DogTriatlonParticipant dog2 = new DogTriatlonParticipant("Rush", 3, 78, 72, 80);
        DogTriatlonParticipant dog3 = new DogTriatlonParticipant("Ginger", 3, 90, 86, 72);

        dog1.display();
        dog2.display();
        dog3.display();
    }
}
