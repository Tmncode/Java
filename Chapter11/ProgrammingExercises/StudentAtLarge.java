package Chapter11.ProgrammingExercises;
// tuition for a StudentAtLarge is $2,000 per semester.
// The class contains fields for student ID number, last name, and annual tuition.
// Include a constructor that requires parameters for the ID number and name.
// Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java.

public class StudentAtLarge extends Student{
    public static final double SAL_TUITION = 2000;
    public StudentAtLarge (String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = SAL_TUITION;
    }
}
