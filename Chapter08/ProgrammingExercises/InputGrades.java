package Chapter08.ProgrammingExercises;

import java.util.Scanner;

public class InputGrades {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);

        String courseID;
        char grade;

        int studentID;
        int credits;

        final int NUM_COURSE = 5;

        Student[] students = new Student[10];
        CollegeCourse course = new CollegeCourse();

        System.out.println("Enter data for ten students: ");
        for(int x = 0; x < students.length; x++){
            System.out.print("\nStudent #" + (x + 1) + "\nStudent ID #");
            students[x] = new Student();

            studentID = input1.nextInt();
            students[x].setStuID(studentID);

            System.out.println("\nCourse");

            for(int y = 0; y < NUM_COURSE; y++){
                System.out.print("\nEnter the following data: \n\nCS" + (y + 1) + " ");
                courseID = input.nextLine();

                course.setID(courseID);

                System.out.print("Credits: ");
                credits = input.nextInt();
                course.setCredits(credits);

                System.out.print("Letter grade: ");
                grade = input.next().charAt(0);

                
                boolean isGradeValid = false;
                while(!isGradeValid){
                    switch(grade){
                        case 'A':
                        case 'B':
                        case 'C':
                        case 'D':
                        case 'F':
                            isGradeValid = true;
                            break;
                        default:
                            System.out.print("\nInvalid letter grade input.\nLetter grade: ");
                            grade = input.nextLine().charAt(0);
                            isGradeValid = false;
                    }
                }
                course.setGrade(grade);
                students[x].setCourse(course, y);
                isGradeValid = false;
            }
        }
        for(int n = 0; n < students.length; n++){
            for(CollegeCourse displayCourse : students[n].getAllCourse()){
                System.out.println(displayCourse);
            }
        }
    }
}
