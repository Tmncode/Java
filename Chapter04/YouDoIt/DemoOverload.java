package Chapter04.YouDoIt;

public class DemoOverload {

    public static void main(String[] args) {
        int month = 6;
        int day = 24;
        int year = 2020;

        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }

    public static void displayDate(int mm){
        System.out.println("Event date: " + mm + "/1/2019");
    }

    public static void displayDate(int mm, int dd){
        System.out.println("Event date: " + mm + "/" + dd + "/2019");
    }

    public static void displayDate(int mm, int dd, int yy){
        System.out.println("Event date: " + mm + "/" + dd + "/" + yy);
    }

}
