package Chapter11.ProgrammingExercises;
// Create an abstract class named Element that holds properties of elements,
// including their symbol, atomic number, and atomic weight.
// Include a constructor that requires values for all three properties and a get method for each value.
// (For example, the symbol for carbon is C, its atomic number is 6, and its atomic weight is 12.01.
// You can find these values by reading a periodic table in a chemistry reference or by searching the Internet.)
// Also include an abstract method named describeElement().

public abstract class Element {
    String symbol;
    int atomicNumber;
    double atomicWeight;
    public Element(String s, int an, double aw)
    {
        symbol = s;
        atomicNumber = an;
        atomicWeight = aw;
    }
    public String getSymbol()
    {
        return symbol;
    }
    public int getAtomicNumber()
    {
        return atomicNumber;
    }
    public double getAtomicWeight()
    {
        return atomicWeight;
    }
    public abstract void describeElement();
}
