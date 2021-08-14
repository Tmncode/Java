package Chapter12.ProgrammingExercises;

public class DataEntryException extends Exception{
    public DataEntryException(int num)
    {
        super("DataEntryException - " + num);
    }
}
