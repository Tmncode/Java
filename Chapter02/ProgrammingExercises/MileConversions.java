package Chapter02.ProgrammingExercises;

public class MileConversions {
    public static void main(String[] args)
    {
        final double KM_IN_MILE = 1.852;
        final double MILES_IN_MILE = 1.150779;
        double Miles = 200;
        double km;
        double miles;

        km = Miles * KM_IN_MILE;
        miles = Miles * MILES_IN_MILE;

        System.out.println(Miles + " nautical miles equals " + km + " kilometers or " + miles + " miles.");
    }
}
