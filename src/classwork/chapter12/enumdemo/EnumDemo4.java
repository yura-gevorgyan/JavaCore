package classwork.chapter12.enumdemo;

public class EnumDemo4 {

    public static void main(String[] args) {
        Apple ap, ap2, ap3;

        for (Apple apple : Apple.values()) {
            System.out.println(apple + " " + apple.ordinal());
        }

        ap = Apple.REDDEL;
        ap2 = Apple.GOLDENDEL;
        ap3 = Apple.REDDEL;

        if (ap.compareTo(ap2) < 0) {
            System.out.println(ap + " " + ap2);
        }
        if (ap.compareTo(ap2) > 0) {
            System.out.println(ap2 + " " + ap);
        }
        if (ap.compareTo(ap2) == 0) {
            System.out.println(ap + " = " + ap3);
        }

        System.out.println();

        if (ap.equals(ap2)) {
            System.out.println("False");
        }

        if (ap.equals(ap3)) {
            System.out.println(ap + " = " + ap3);
        }

        if (ap == ap3) {
            System.out.println(ap + " == " + ap3);
        }
    }
}
