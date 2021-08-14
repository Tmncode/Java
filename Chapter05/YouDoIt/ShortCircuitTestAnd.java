package Chapter05.YouDoIt;

public class ShortCircuitTestAnd {

    public static void main(String[] args) {
        if(trueMethod() && falseMethod())
            System.out.println("Both or true");
        else
            System.out.println("Both or not true");
    }
    public static boolean trueMethod(){
        System.out.println("Within trueMethod()");
        return true;
    }
    public static boolean falseMethod(){
        System.out.println("Within falseMethod()");
        return false;
    }
}
