package classwork.chapter2;

public class IfSample {
    public static void main(String[] args) {
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x < y");
        }
        x = x * 2;
        if (x == y) {
            System.out.println("now x = y");
        }
        x = x * 2;
        if (x > y) {
            System.out.println("now is x > Y");
        }
        if (x == y) {
            System.out.println("now x = y");
        }
    }
}
