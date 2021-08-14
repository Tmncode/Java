package Chapter05.GameZone;

import Chapter04.GameZone.Die;

public class TwoDice2 {
    public static void main(String[] args)
    {
        Die firstDice = new Die();
        Die secondDice = new Die();

        int value1 = firstDice.getValue();
        int value2 = secondDice.getValue();

        System.out.println("First die is  " + value1);
        System.out.println("Second die is " + value2);

        if(value1 > value2)
            System.out.println("First is greater");
        else
        if(value2 > value1)
            System.out.println("Second value is greater");
        else
            System.out.println("The dice are equal");
    }
}
