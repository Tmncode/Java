package Chapter03.GameZone;

public class MyCharacter {

    private int energy;
    private int numberOfLives;
    private int numberOfHealth;

    public int getEnergy()
    {
        return energy;
    }
    public int getLive()
    {
        return numberOfLives;
    }
    public int getHealth()
    {
        return numberOfHealth;
    }
    public void setEnergy(int e)
    {
        energy = e;
    }
    public void setLive(int l)
    {
        numberOfLives = l;
    }
    public void setHealth(int h)
    {
        numberOfHealth = h;
    }
}
