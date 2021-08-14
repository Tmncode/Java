package Chapter11.ProgrammingExercises;
// Create two extended classes named MetalElement and NonMetalElement.
// Each contains a describeElement() method that displays the details of the element
// and a brief explanation of the properties of the element type.
// For example, metals are good conductors of electricity, while nonmetals are poor conductors.

public class MetalElement extends Element{
    public MetalElement(String s, int an, double aw)
    {
        super(s, an, aw);
    }
    public void describeElement()
    {
        System.out.println("A metal, like " + getSymbol() +
                " with atomic number " + getAtomicNumber() +
                " and an atomic weight of " + getAtomicWeight() +
                "\n    is a good conductor of electricity");
    }
}
