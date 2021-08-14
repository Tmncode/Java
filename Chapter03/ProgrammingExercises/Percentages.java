package Chapter03.ProgrammingExercises;

public class Percentages {

    public static void main(String[] args) {
        double percentage1 = 2.0;
        double percentage2 = 5.0;

        System.out.println(percentage1 + " is " + computePercentage(percentage1, percentage2) + " percent " + " of " + percentage2);
        System.out.println(percentage2 + " is " + computePercentage(percentage2, percentage1) + " percent " + " of " + percentage1);

    }

    public static double computePercentage(double p1, double p2){
        double total;
        total = (p1 / p2) * 100;
        return total;
    }
}
