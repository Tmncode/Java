package Chapter09.ProgrammingExercises;

import java.util.*;

public class StringSort {
    public static void main(String[] args)
    {
        String[] values =  {"mouse", "dog", "cat", "horse", "cow",
                "moose", "tiger", "lion", "elephant", "bird", "hamster",
                "guinea pig", "leopard", "aardvark", "hummingbird"};
        int x;
        Arrays.sort(values);
        for(x = 0; x < values.length; ++x)
            System.out.println(values[x] + " ");
    }
}
