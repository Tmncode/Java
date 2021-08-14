package Chapter04.YouDoIt;

public class CreatePolicies {

    public static void main(String[] args) {

        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "NewCastle");
        //CarInsurancePolicy fourth = new CarInsurancePolicy();

        first.display();
        second.display();
        third.display();
    }
}
