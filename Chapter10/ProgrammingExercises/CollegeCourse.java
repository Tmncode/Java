package Chapter10.ProgrammingExercises;
import java.util.*;
public class CollegeCourse {
    // attributes
    protected String dept;
    protected int id;
    protected double credits;
    protected double price;
    // constructor
    public CollegeCourse(String dep, int num, double cr)
    {
        final int FEEPERCREDIT = 120;
        dept = dep;
        id = num;
        credits = cr;
        price = cr * FEEPERCREDIT;
    }
    // display()
    public void display()
    {
        System.out.print(dept + id + "\nNon-lab course\n" +  credits +
                " credits\nTotal fee is $" + price);
    }
}
