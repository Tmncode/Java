package Chapter10.ProgrammingExercises;

public class LabCourse extends CollegeCourse {
    // attribute
    private final int LABFEE = 50;
    // Constructor
    public LabCourse(String dept, int id, int credits)
    {
        super(dept,  id, credits);
        price = price + LABFEE;
    }
    // override display
    @Override
    public void display()
    {
        System.out.println(dept + id + "\nLab course\n" +  credits +
                        " credits\nLab fee is $" + LABFEE +
                        "\nTotal fee is $" + price);
    }
}
