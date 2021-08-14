package Chapter11.ProgrammingExercises;
// tuition for a GraduateStudent is $6,000 per semester,
// The class contains fields for student ID number, last name, and annual tuition.
// Include a constructor that requires parameters for the ID number and name.
// Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java.

public class GraduateStudent extends Student{
    public static final double GRAD_TUITION = 6000;
    public GraduateStudent(String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = GRAD_TUITION;
    }
}
