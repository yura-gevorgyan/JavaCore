package classwork.chapter3;

public class Conversion {
    public static void main(String[] args) {
        byte b ;
        int i = 257;
        double d = 323.142;
        b = (byte) i;
        System.out.println("b is " + b);
        i = (int) d;
        System.out.println("i and d are " + i + " " + d);
        b = (byte) d;
        System.out.println("d and b are " + d + " " + b);

    }
}
