package Chapter11.ProgrammingExercises;

public class NonFiction extends Book{
    // constructor
    public NonFiction(String title){
        super(title);
        setPrice();
    }
    // setPrice()
    public void setPrice(){
        super.price = 37.99;
    }
}
