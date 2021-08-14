package Chapter11.ProgrammingExercises;
// Create three Student subclasses named UndergraduateStudent, GraduateStudent, and StudentAtLarge, each with a unique setTuition() method.
// Tuition for an UndergraduateStudent is $4,000 per semester,
// The class contains fields for student ID number, last name, and annual tuition.
// Include a constructor that requires parameters for the ID number and name.
// Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java.

public class UndergraduateStudent extends Student{
    public static final double UNDERGRAD_TUITION = 4000;
    public UndergraduateStudent(String id, String name)
    {
        super(id, name);
        setTuition();
    }
    public void setTuition()
    {
        tuition = UNDERGRAD_TUITION;
    }
}
