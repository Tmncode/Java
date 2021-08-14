package Chapter11.ProgrammingExercises;
// Create an abstract Division class with fields for a company’s division name and account number,
// and an abstract display() method.

public abstract class Division {
    protected String divisionTitle;
    protected int acctNum;
    public Division(String title, int acct)
    {
        divisionTitle = title;
        acctNum = acct;
    }
    public abstract void display();
}
