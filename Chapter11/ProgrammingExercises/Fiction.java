package Chapter11.ProgrammingExercises;

public class Fiction extends Book{
    // constructor
    public Fiction(String title){
        super(title);
        setPrice();
    }
    // setPrice()
    public void setPrice(){
        super.price = 24.99;
    }
}
