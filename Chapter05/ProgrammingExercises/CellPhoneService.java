package Chapter05.ProgrammingExercises;
import java.util.*;

public class CellPhoneService {
    public static void main(String[] args) {
        final int TALK_MIN = 500;
        final int TEXT_MIN = 100;
        final int DATA_MIN = 2;
        final int PLAN_A = 49;
        final int PLAN_B = 55;
        final int PLAN_C = 61;
        final int PLAN_D = 70;
        final int PLAN_E = 79;
        final int PLAN_F = 87;

        String message;
        String plan;

        int talk;
        int texts;
        int data;
        int price;

        Scanner entry = new Scanner(System.in);

        System.out.print("Enter talk minutes needed... ");
        talk = entry.nextInt();

        System.out.print("Enter text message needed... ");
        texts = entry.nextInt();

        System.out.print("Enter gigabytes of data needed... ");
        data = entry.nextInt();

        if(data > 0)
            if(data <= DATA_MIN){
                plan = "E";
                price = PLAN_E;
            }
            else{
                plan = "F";
                price = PLAN_F;
            }
        else
        if(talk < TALK_MIN)
            if (texts == 0 && data == 0){
                plan = "A";
                price = PLAN_A;
            }
            else{
                plan = "B";
                price = PLAN_B;
            }
        else
        if(texts < TEXT_MIN){
            plan = "C";
            price = PLAN_C;
        }
        else{
            plan = "D";
            price = PLAN_D;
        }

        message = "Plan " + plan + " $" + price + " per month";
        System.out.println(message);
    }
}
