package Chapter07.ProgrammingExercises;
import java.util.*;

public class BabyNameComparison {
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name >> ");
        name1 = input.nextLine();

        System.out.print("Enter second name >> ");
        name2 = input.nextLine();

        System.out.print("Enter third name >> ");
        name3 = input.nextLine();

        System.out.println("The combination are: ");
        System.out.println(name1 + " " + name2);
        System.out.println(name1 + " " + name3);
        System.out.println(name2 + " " + name1);
        System.out.println(name2 + " " + name3);
        System.out.println(name3 + " " + name1);
        System.out.println(name3 + " " + name2);

    }
}
