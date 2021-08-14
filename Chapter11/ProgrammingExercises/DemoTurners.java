package Chapter11.ProgrammingExercises;
// Write an application named DemoTurners that creates one object of each of these class types
// and demonstrates the turn() method for each class.
// Save the files as Turner.java, Leaf.java, Page.java, Pancake.java, and DemoTurners.java.

public class DemoTurners {
    public static void main(String[] args)
    {
        Leaf aLeaf = new Leaf();
        Page aPage = new Page();
        Pancake aCake = new Pancake();
        aLeaf.turn();
        aPage.turn();
        aCake.turn();
    }
}
