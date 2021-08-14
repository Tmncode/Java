package Chapter11.ProgrammingExercises;
// BusinessLoan — A public class that extends Loan.
// The BusinessLoan constructor sets the interest rate to 1% more than the current prime interest rate.

public class BusinessLoan extends Loan{
    public BusinessLoan(int num, String name, double amt, int yrs,  double prime)
    {
        super(num, name, amt, yrs);
        rate = prime + .01;
    }
}
