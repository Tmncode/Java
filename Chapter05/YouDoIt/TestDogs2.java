package Chapter05.YouDoIt;

import Chapter05.YouDoIt.DogTriatlonParticipant2;

public class TestDogs2 {
    public static void main(String[] args) {
        DogTriatlonParticipant2 dog1 = new DogTriatlonParticipant2("Bowser", 2, 85, 89, 0);
        DogTriatlonParticipant2 dog2 = new DogTriatlonParticipant2("Rush", 2, 0, 174, 0);
        DogTriatlonParticipant2 dog3 = new DogTriatlonParticipant2("Ginger", 3, 0, 0, 0);

        dog1.display();
        dog2.display();
        dog3.display();
    }
}
