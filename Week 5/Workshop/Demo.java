package Workshop;

public class Demo {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        } catch (ArithmeticException zero) {
            System.out.println("Zero can't be divie");
        }
    }
}