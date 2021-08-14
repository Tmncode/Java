package Chapter02.YouDoIt;

public class IntegerDemo {
    public static void main(String[] args) {
        int anInt = 12;
        byte aByte = 12;
        short aShort = 12;
        long aLong = 12;

        System.out.println("The int is: " + anInt);
        System.out.println("The byte is: " + aByte);
        System.out.println("The short is: " + aShort);
        System.out.println("The long is: " + aLong);

        System.out.println("Int is: " + anInt + " byte is: " + aByte + " short is: " + aShort + " long is: " + aLong);

        int anotherInt = anInt * 1_000_000;
        System.out.println("Another int is: " + anotherInt);
    }
}
