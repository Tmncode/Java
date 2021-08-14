package Chapter11.ProgrammingExercises;
// Use a constructor in the superclass that requires values for both fields.
// Write an application named UseDivision that creates
// InternationalDivision and DomesticDivision objects for two different companies and displays information about them.
// Save the files as Division.java, InternationalDivision.java, DomesticDivision.java, and UseDivision.java.

public abstract class UseDivision {
    public static void main(String[] args)
    {
        DomesticDivision abcDomDiv = new
                DomesticDivision("Sales", 123, "California");
        DomesticDivision xyzDomDiv = new
                DomesticDivision("Technology", 234, "Kansas");
        InternationalDivision abcIntDiv = new
                InternationalDivision("Technology", 345, "Germany", "German");
        InternationalDivision xyzIntDiv = new
                InternationalDivision("Marketing", 456, "Japan",
                "Japanese");
        abcDomDiv.display();
        xyzDomDiv.display();
        abcIntDiv.display();
        xyzIntDiv.display();
    }
}
