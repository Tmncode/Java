package Chapter11.ProgrammingExercises;
// Use a constructor in the superclass that requires values for both fields.
// Create two subclasses named InternationalDivision and DomesticDivision.
// The InternationalDivision includes a field for the country in which the division is located
// and a field for the language spoken; its constructor requires both.
// The DomesticDivision includes a field for the state in which the division is located;
// a value for this field is required by the constructor.

public class DomesticDivision extends Division{
    protected String state;
    public DomesticDivision(String title, int acct, String st)
    {
        super(title, acct);
        state = st;
    }
    public void display()
    {
        System.out.println("Domestic Division: " +
                divisionTitle + "  Acct #" + acctNum +
                "\nLocated in " + state);
    }
}
