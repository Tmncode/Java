package Chapter08.ProgrammingExercises;

public class Student {
    private int stuID;
    private CollegeCourse[] course = new CollegeCourse[5];

    public int getID() {
        return stuID;
    }
    public CollegeCourse getCourse(int x) {
        return course[x];
    }
    public void setStuID(int idNum) {
        stuID = idNum;
    }
    public void setCourse(CollegeCourse c, int x) {
        course[x] = c;
    }
    public CollegeCourse[] getAllCourse(){
        return course;
    }
}
