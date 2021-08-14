package Chapter11.ProgrammingExercises;
// PersonalLoan — A public class that extends Loan.
// The PersonalLoan constructor sets the interest rate to 2% more than the current prime interest rate.

public class PersonalLoan extends Loan{
    public PersonalLoan(int num, String name, double amt, int yrs,  double prime)
    {
        super(num, name, amt, yrs);
        rate = prime + .02;
    }
}
