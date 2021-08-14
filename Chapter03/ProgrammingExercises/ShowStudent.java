package Chapter03.ProgrammingExercises;

import Chapter03.ProgrammingExercises.Student;

public class ShowStudent {

    @SuppressWarnings("static-access")
    public static void main( String args[] )
    {

        Student student = new Student();

        student.setGpa( 25,4 );
        System.out.println( student.getGpa() );

        student.setPtsEarned(25);
        student.setCreditsEarned(7);
        System.out.println( student.getGpa() );

        student.setCreditsEarned(4);
        System.out.println( student.getPtsEarned() );

    }
}
