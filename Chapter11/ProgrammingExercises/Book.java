package Chapter11.ProgrammingExercises;

public abstract class Book {
    // attributes
    String title = new String();
    double price;
    // constructor
    public Book(String t) {
        title = t;
    }
    public String getTitle() {
        return title;
    }
    // get and set methods
    public double getPrice(){
        return price;
    }
    public abstract void setPrice();
}
