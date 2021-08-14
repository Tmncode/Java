package Chapter03.ProgrammingExercises;

public class Sandwich {

    public static String mainIngredient = "";
    public static String bread = "";
    public static double price;

    public static void main(String args[])
    {
        
    }

    public void setMainIngredient( String mType )
    {
        mainIngredient = mType;
    }

    public String getMainIngredient()
    {
        return mainIngredient;
    }

    public void setBread( String wheat )
    {
        bread = wheat;
    }

    public String getBread()
    {
        return bread;
    }

    public void setPrice( double p )
    {
        price = p;
    }

    public double getPrice()
    {
        return price;
    }
}
