package classwork.chapter12.enumdemo;

public class EnumDemo2 {

    public static void main(String[] args) {

        Apple ap;

        System.out.println("Apple: ");

        Apple[] apples = Apple.values();

        for (Apple apple : apples) {
            System.out.print(apple + " ");
        }

        System.out.println();

        ap = Apple.valueOf("WINESAP");

        System.out.println(ap);

    }
}
