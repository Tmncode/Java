package Chapter04.YouDoIt;

public class CarInsurancePolicy2 {

    private final int policyNumber;
    private final int numPayment;
    private final String residentCity;

    public CarInsurancePolicy2(int num, int payments, String city){
        policyNumber = num;
        numPayment = payments;
        residentCity = city;
    }

    public CarInsurancePolicy2(int num, int payments){
        this(num, payments, "Mayfield");
    }

    public CarInsurancePolicy2(int num){
       this(num, 2);
    }

    public void display(){
        System.out.println("Policy #" + policyNumber + ". " + numPayment + " payments annually. Driver resides in " +
                residentCity + ".");
    }

}
