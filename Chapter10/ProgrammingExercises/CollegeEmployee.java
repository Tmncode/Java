package Chapter10.ProgrammingExercises;
import java.util.*;

public class CollegeEmployee extends Person {
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
    public void setData()
    {
        // write your code here
        String temp;
        super.setData();
        System.out.print("Please enter Social Security number >> ");
        ssn = input.nextLine();
        System.out.print("Please enter annual salary >> ");
        temp = input.nextLine();
        annualSalary = Double.parseDouble(temp);
        System.out.print("Please enter employee's department >> ");
        dept = input.nextLine();
    }
    @Override
    public void display()
    {
        // write your code here
        super.display();
        System.out.println("SSN: " + ssn + " Salary $" +
                annualSalary + " Department: " + dept);
    }
}
