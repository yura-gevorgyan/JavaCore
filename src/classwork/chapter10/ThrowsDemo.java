package classwork.chapter10;

public class ThrowsDemo {

    static void throwOne() throws IllegalAccessException {
        System.out.println("Method throwOne()");
        throw new IllegalAccessException("Exception");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
