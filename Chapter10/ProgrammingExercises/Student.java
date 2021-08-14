package Chapter10.ProgrammingExercises;
import java.util.*;

public class Student extends Person{
    private String major;
    private double gpa;
    Scanner input = new Scanner(System.in);
    @Override
    public void setData()
    {
        // write your code here
        String temp;
        super.setData();
        System.out.print("Please enter student major >> ");
        major = input.nextLine();

        System.out.print("Please enter student grade point average >> ");
        temp = input.nextLine();
        gpa = Double.parseDouble(temp);
    }
    @Override
    public void display()
    {
        // write your code here
        super.display();
        System.out.println("Major: " + major + "  GPA: " + gpa);
    }
}
