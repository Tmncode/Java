package Chapter12.ProgrammingExercises;

// Create an OrderException class that stores one of the messages.
public class OrderException extends Exception{
    public OrderException(String s) {
        super(s);
    }
}
