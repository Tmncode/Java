package Chapter10.ProgrammingExercises;
import java.util.*;
public class UseCourse {
    public static void main(String[] args)
    {
        String dept, inStr;
        String[] labCourses = {"BIO", "CHM", "CIS", "PHY"};
        int id, credits;
        int found = 0;
        int x;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter department >> ");
        dept = keyboard.nextLine();

        System.out.print("Enter course number >> ");
        inStr = keyboard.nextLine();
        id = Integer.parseInt(inStr);

        System.out.print("Enter credits >> ");
        credits = Integer.parseInt(inStr);

        for(x = 0; x < labCourses.length; ++x)
            if(dept.equals(labCourses[x]))
                found = 1;
        if(found == 1)
        {
            LabCourse course = new LabCourse(dept, id, credits);
            course.display();
        }
        else
        {
            CollegeCourse course = new CollegeCourse(dept, id, credits);
            course.display();
        }
    }
}
