package Chapter11.ProgrammingExercises;
// The Insurance class contains a String representing the type of insurance and a double that holds the monthly price.
// The Insurance class constructor requires a String argument indicating the type of insurance,
// but the Life and Health class constructors require no arguments.
// The Insurance class contains a get method for each field; it also contains two abstract methods named setCost() and display().

public abstract class Insurance {
    protected String type;
    protected double cost;
    public Insurance(String lh)
    {
        type = lh;
    }
    public String getType()
    {
        return type;
    }
    public double getCost()
    {
        return cost;
    }
    public abstract void setCost();
    public abstract void display();
}
