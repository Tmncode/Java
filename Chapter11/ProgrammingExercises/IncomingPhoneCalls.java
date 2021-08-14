package Chapter11.ProgrammingExercises;

public class IncomingPhoneCalls extends PhoneCalls{
    public final static double RATE = .02;
    public IncomingPhoneCalls(String num)
    {
        super(num);
        price = RATE;
    }
    public void getInfo()
    {
        System.out.println("Incoming phone call " +
                getPhoneNumber() + " " + RATE + " per call. Total is $" +
                + getPrice());
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }
    public double getPrice()
    {
        return price;
    }
}
