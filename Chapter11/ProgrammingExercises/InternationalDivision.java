package Chapter11.ProgrammingExercises;
// Use a constructor in the superclass that requires values for both fields.
// Create two subclasses named InternationalDivision and DomesticDivision.
// The InternationalDivision includes a field for the country in which the division is located
// and a field for the language spoken; its constructor requires both.
// The DomesticDivision includes a field for the state in which the division is located;
// a value for this field is required by the constructor.

public class InternationalDivision extends Division{
    protected String country;
    protected String language;
    public InternationalDivision(String title, int acct, String cty, String lang)
    {
        super(title, acct);
        country = cty;
        language = lang;
    }
    public void display()
    {
        System.out.println("International Division: " + divisionTitle +
                "  Acct #" + acctNum + "\nLocated in " + country +
                " Language is " + language);
    }
}
