package Chapter03.GameZone;

import Chapter03.GameZone.MyCharacter;

public class TwoCharacters {

    public static void main(String[] args)
    {
        int energy;
        int lives;
        int health;

        MyCharacter char1 = new MyCharacter();
        MyCharacter char2 = new MyCharacter();

        energy = ((int)(Math.random() * 100) + 1);
        lives = ((int)(Math.random() * 100) + 1);
        health = ((int)(Math.random() * 100) + 1);

        char1.setEnergy(energy);
        char1.setLive(lives);
        char1.setHealth(health);

        energy = ((int)(Math.random() * 100) + 1);
        lives = ((int)(Math.random() * 100) + 1);
        health = ((int)(Math.random() * 100) + 1);

        char2.setEnergy(energy);
        char2.setLive(lives);
        char2.setHealth(health);

        display(char1);
        display(char2);
    }
    public static void display(MyCharacter ch)
    {
        System.out.println("Your character have " + ch.getEnergy() +
                " energy, has " + ch.getLive() + " lives and " +
                ch.getHealth() + " Health");
    }
}
