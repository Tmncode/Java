package Chapter11.ProgrammingExercises;
// LoanConstants — A public interface class.
// LoanConstants includes constant values for short-term (1 year), medium-term (3 years), and long-term (5 years) loans.
// It also contains constants for the company name and the maximum loan amount.

public interface LoanConstants {
    public static final int MAXLOAN = 100000;
    public static final int SHORT_TERM = 1;
    public static final int MEDIUM_TERM = 3;
    public static final int LONG_TERM = 5;
    public static final String COMPANY = "Sanchez Construction";
}
