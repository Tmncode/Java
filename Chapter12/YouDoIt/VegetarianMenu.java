package Chapter12.YouDoIt;

public class VegetarianMenu extends Menu{
    // Provide new menu choices for the VegetarianMenu as follows:
    String[] vegEntreeChoices = {"Spinach Lasagna", "Cheese Enchiladas",
                                 "Fruit Plate"};

    // Add the following constructor that calls the superclass constructor
    // and assigns each vegetarian selection to the Menu superclass entreeChoices array,
    // and then add the closing curly brace for the class:
    public VegetarianMenu(){
        super();
        for(int x = 0; x < vegEntreeChoices.length; ++x)
            entreeChoices[x] = vegEntreeChoices[x];
    }
}
