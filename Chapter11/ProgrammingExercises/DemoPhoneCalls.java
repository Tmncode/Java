package Chapter11.ProgrammingExercises;

public class DemoPhoneCalls {
    public static void main(String[] args)
    {
        IncomingPhoneCalls inCall = new IncomingPhoneCalls("212-555-3096");
        OutgoingPhoneCalls outCall = new OutgoingPhoneCalls("312-874-0232", 10);
        inCall.getInfo();
        outCall.getInfo();
    }
}
