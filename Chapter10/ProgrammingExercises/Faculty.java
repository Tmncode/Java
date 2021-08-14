package Chapter10.ProgrammingExercises;
import java.util.*;

public class Faculty extends CollegeEmployee{
    private boolean isTenured = false;
    Scanner input = new Scanner(System.in);
    @Override
    public void setData()
    {
        // write your code here
        String temp;
        super.setData();
        System.out.print("Is this faculty member tenured - Y or N? >> ");
        temp = input.nextLine();
        if(temp.charAt(0) == 'Y' || temp.charAt(0) == 'y')
            isTenured = true;
    }
    @Override
    public void display()
    {
        // write your code here
        super.display();
        if(isTenured)
            System.out.println("Faculty member is tenured");
        else
            System.out.println("Faculty member is not tenured");
    }
}
