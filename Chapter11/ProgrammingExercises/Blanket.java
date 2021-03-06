package Chapter11.ProgrammingExercises;
// Create a class named Blanket with fields for a blanket’s size, color, material, and price.
// Include a constructor that sets default values for the fields as Twin, white, cotton, and $30.00.
// Include a set method for each of the first three fields.
// The method that sets size adds $10 to the base price for a double blanket, $25 for a queen blanket, and $40 for a king.
// The method that sets the material adds $20 to the price for wool and $45 to the price for cashmere.
// In other words, the price for a king-sized cashmere blanket is $115.
// Whenever the size or material is invalid, reset the blanket to the default values.
// Include a toString() method that returns a description of the blanket. Save the file as Blanket.java.

public class Blanket {
    protected String size;
    protected String color;
    protected String material;
    protected double price;
    protected double sizePremium;
    protected double materialPremium;
    private final String SIZE1 = "Twin";
    private final String SIZE2 = "Double";
    private final String SIZE3 = "Queen";
    private final String SIZE4 = "King";
    protected final double BASE_PRICE = 30;
    private final double S_PRICE2 = 10;
    private final double S_PRICE3 = 25;
    private final double S_PRICE4 = 40;
    private final String MAT1 = "cotton";
    private final String MAT2 = "wool";
    private final String MAT3 = "cashmere";
    private final double M_PRICE2 = 20;
    private final double M_PRICE3 = 45;
    public Blanket()
    {
        setDefaults();
    }
    private void setDefaults()
    {
        size = SIZE1;
        color = "white";
        material = "cotton";
        sizePremium = 0;
        materialPremium = 0;
        price = BASE_PRICE;
    }
    public String getSize()
    {
        return size;
    }
    public String getColor()
    {
        return color;
    }
    public String getMaterial()
    {
        return material;
    }
    public void setSize(String s)
    {
        size = s;
        if(s.equals(SIZE1))
            sizePremium = 0;
        else
        if(s.equals(SIZE2))
            sizePremium = S_PRICE2;
        else
        if(s.equals(SIZE3))
            sizePremium = S_PRICE3;
        else
        if(s.equals(SIZE4))
            sizePremium = S_PRICE4;
        else
            setDefaults();
        price = BASE_PRICE + sizePremium + materialPremium;
    }
    public void setMaterial(String m)
    {
        material = m;
        if(m.equals(MAT1))
            materialPremium = 0;
        else
        if(m.equals(MAT2))
            materialPremium = M_PRICE2;
        else
        if(m.equals(MAT3))
            materialPremium = M_PRICE3;
        else
            setDefaults();
        price = BASE_PRICE + sizePremium + materialPremium;
    }
    public String toString()
    {
        return size + " size " + material + " blanket.  Price $" + price;
    }
}
