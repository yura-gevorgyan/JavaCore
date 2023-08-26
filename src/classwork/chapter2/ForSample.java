package classwork.chapter2;

public class ForSample {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("x is " + x);
            System.out.println("y is " + y);
            y=y-2;
        }
    }
}
