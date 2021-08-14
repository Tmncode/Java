package Chapter11.ProgrammingExercises;

public abstract class PhoneCalls {
    String phoneNumber;
    double price;
    public PhoneCalls(String num)
    {
        phoneNumber = num;
        price = 0.0;
    }
    public void setPrice(double pr)
    {
        price = pr;
    }
    public abstract String getPhoneNumber();
    public abstract double getPrice();
    public abstract void getInfo();
}
