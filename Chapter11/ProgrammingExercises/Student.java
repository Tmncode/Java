package Chapter11.ProgrammingExercises;
// Create an abstract Student class for Parker University.
// The class contains fields for student ID number, last name, and annual tuition.
// Include a constructor that requires parameters for the ID number and name.
// Include get and set methods for each field; the setTuition() method is abstract.
// Save the files as Student.java, UndergraduateStudent.java, GraduateStudent.java, StudentAtLarge.java, and StudentDemo.java.

public abstract class Student {
    private String id;
    private String lastName;
    protected double tuition;
    public Student(String id, String name)
    {
        setId(id);
        setLastName(name);
    }
    public void setId(String idNum)
    {
        id = idNum;
    }
    public void setLastName(String name)
    {
        lastName = name;
    }
    public String getId()
    {
        return id;
    }
    public String getLastName()
    {
        return lastName;
    }
    public double getTuition()
    {
        return tuition;
    }
    public abstract void setTuition();
}
