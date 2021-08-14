package Chapter11.ProgrammingExercises;
import javax.swing.*;
// CreateLoans — An application that creates an array of five Loans. Prompt the user for the current prime interest rate.
// Then, in a loop, prompt the user for a loan type and all relevant information for that loan.
// Store the created Loan objects in the array. When data entry is complete, display all the loans.

public class CreateLoan implements LoanConstants{
    public static void main(String[] args)
    {
        final int MAX = 5;
        Loan[] loan = new Loan[MAX];
        int x;
        int num;
        String name;
        double amt, rate;
        int loanType;
        int term;
        String inStr,  outString = COMPANY + "\n";
        inStr = JOptionPane.showInputDialog(null,
                "Welcome to " + COMPANY +
                        "\nEnter the current prime interest rate" +
                        "\nas a decimal number, for example, .05");
        rate = Double.parseDouble(inStr);
        for(x = 0; x < MAX; ++x)
        {
            inStr = JOptionPane.showInputDialog(null,
                    "Is this a (1) Business loan" +
                            "\nor (2) Personal loan");
            loanType = Integer.parseInt(inStr);
            inStr = JOptionPane.showInputDialog(null,
                    "Enter account number");
            num = Integer.parseInt(inStr);
            name = JOptionPane.showInputDialog(null,
                    "Enter name");
            inStr = JOptionPane.showInputDialog(null,
                    "Enter loan amount");
            amt = Double.parseDouble(inStr);
            inStr = JOptionPane.showInputDialog(null,
                    "Enter term");
            term = Integer.parseInt(inStr);
            if(loanType == 1)
            {
                BusinessLoan temp = new
                        BusinessLoan(num, name, amt, term, rate);
                loan[x] = temp;
            }
            else
            {
                PersonalLoan temp = new PersonalLoan(num, name, amt, term, rate);
                loan[x] = temp;
            }
        }
        for(x = 0; x < MAX; ++x)
            outString += loan[x].toString() + "\n";
        JOptionPane.showMessageDialog(null, outString);
    }
}
