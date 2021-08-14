package Chapter06.ProgrammingExercises;

public class Factorials {
    public static void main(String[] args) {
        int fact;
        final int MAX = 10;

        for(int i = 1; i <= MAX; i++){
            fact = i;
            for(int j = i - 1; j > 0; --j)
                fact = fact * j;
            System.out.println("Factorial of " + i + " is: " + fact);
        }
    }
}
