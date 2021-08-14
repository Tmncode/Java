package Chapter11.ProgrammingExercises;
// Create two extended classes named MetalElement and NonMetalElement.
// Each contains a describeElement() method that displays the details of the element
// and a brief explanation of the properties of the element type.
// For example, metals are good conductors of electricity, while nonmetals are poor conductors.

public class NonMetalElement extends Element{
    public NonMetalElement(String s, int an, double aw)
    {
        super(s, an, aw);
    }
    public void describeElement()
    {
        System.out.println("A nonmetal, like " + getSymbol() +
                " with atomic number " + getAtomicNumber() +
                " and an atomic weight of " + getAtomicWeight() +
                "\n    is a poor conductor of electricity");
    }
}
