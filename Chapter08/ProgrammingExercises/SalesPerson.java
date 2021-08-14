package Chapter08.ProgrammingExercises;

public class SalesPerson {
    private int id;
    private double sales;

    SalesPerson(int idNum, double amount){
        id = idNum;
        sales = amount;
    }
    public int getId(){
        return id;
    }
    public double getSales(){
        return sales;
    }
    public void setId(int idNum){
        id = idNum;
    }
    public void setSales(double amount){
        sales = amount;
    }
}
