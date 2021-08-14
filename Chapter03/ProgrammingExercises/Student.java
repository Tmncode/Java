package Chapter03.ProgrammingExercises;

public class Student {

    private static int idNum;
    private static double creditsEarned;
    private static double ptsEarned;
    final static double scale = 4;
    private static double gpa;

    public Student()
    {
        idNum         = 100;
        ptsEarned     = 12;
        creditsEarned = 3;
    }
    public static void setID( int id )
    {
        idNum = id;
    }
    public int getID()
    {
        return idNum;
    }
    public static void setCreditsEarned( double hrs )
    {
        creditsEarned = hrs;
    }
    public double getCreditsEarned()
    {

        return creditsEarned;
    }
    public static void setPtsEarned( double pts )
    {
        ptsEarned = pts;
    }
    public double getPtsEarned()
    {
        ptsEarned = creditsEarned * scale;
        return ptsEarned;
    }
    public static void setGpa( double pts, double credits )
    {
        creditsEarned = credits;
        ptsEarned     = pts;

    }

    public double getGpa()
    {   gpa = ptsEarned / creditsEarned;
        return gpa;
    }
}
