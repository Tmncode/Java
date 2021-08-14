package Chapter11.ProgrammingExercises;
// Create an abstract class named Book.
// Include a String field for the book’s title and a double field for the book’s price.
// Within the class, include a constructor that requires the book title,
// and add two get methods—one that returns the title and one that returns the price. Include an abstract method named setPrice().
//
//Create two child classes of Book: Fiction and NonFiction.
// Each must include a setPrice() method that sets the price for all Fiction Books to $24.99 and for all NonFiction Books to $37.99.
// Write a constructor for each subclass, and include a call to setPrice() within each.
// Write an application demonstrating that you can create both a Fiction and a NonFiction Book, and display their fields.
public class BookArray {
    public static void main(String[] args) {
        // your code here
        Book someBook[] = new Book[10];
        int x;
        someBook[0] = new Fiction("Rich Dad Poor Dad");
        someBook[1] = new NonFiction("Introduction to Java");
        someBook[2] = new Fiction("Who stole my cheese");
        someBook[3] = new NonFiction("The Road Not Taken");
        someBook[4] = new Fiction("A Tale of Two Cities");
        someBook[5] = new NonFiction("Europe on $5 a Day");
        someBook[6] = new Fiction("War and Peace");
        someBook[7] = new Fiction("A Simple Plan");
        someBook[8] = new Fiction("Disclosure");
        someBook[9] = new Fiction("Nancy Drew");
        for(x = 0; x < someBook.length; ++x)
            System.out.println("Book: " +
                    someBook[x].getTitle() + " costs $" +
                    someBook[x].getPrice());
    }
}
