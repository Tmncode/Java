package Chapter11.ProgrammingExercises;
// Create a child class named ElectricBlanket that extends Blanket and includes two additional fields:
// one for the number of heat settings and one for whether the electric blanket has an automatic shutoff feature.
// Default values are one heat setting and no automatic shutoff. Include get and set methods for the fields.
// Do not allow the number of settings to be fewer than one or more than five;
// if it is, use the default setting of 1. Add a $5.75 premium to the price if the blanket has the automatic shutoff feature.
// Also include a toString() method that calls the parent class toString() method and combines the returned
// value with data about the new fields to return a complete description of features. Save the file as ElectricBlanket.java.

public class ElectricBlanket extends Blanket{
    private int settings;
    private boolean hasAutoShutoff;
    private final int MAX_SETTINGS = 5;
    private double shutoffPremium;
    private final double S_PRICE = 5.75;
    public ElectricBlanket()
    {
        settings = 1;
        hasAutoShutoff = false;
        shutoffPremium = 0;
    }
    public int getSettings()
    {
        return settings;
    }
    public boolean getHasAutoShutoff()
    {
        return hasAutoShutoff;
    }
    public void setSettings(int s)
    {
        if(s < 1 || s > MAX_SETTINGS)
            s = 1;
        settings = s;
    }
    public void setHasAutoShutoff(boolean h)
    {
        hasAutoShutoff = h;
        if(h)
        {
            shutoffPremium = S_PRICE;
        }
        else
        {
            shutoffPremium = 0;
        }
        price = BASE_PRICE + sizePremium + materialPremium + shutoffPremium;
    }
    public String toString()
    {
        String s;
        s = super.toString();
        if(hasAutoShutoff)
            s += ". Blanket has automatic shutoff";
        else
            s += ". no automatic shutoff";
        s += " and " + settings;
        if(settings == 1)
            s += " setting.";
        else
            s += " settings.";
        return s;
    }
}
