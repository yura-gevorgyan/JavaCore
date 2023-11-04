package classwork.chapter12.enumdemo;

public class EnumDemo3 {

    public static void main(String[] args) {
         Apple ap;

        System.out.println(Apple.WINESAP + " " + Apple.WINESAP.getPrice());

        System.out.println("All Apples prices: ");

        for (Apple apple : Apple.values()) {
            System.out.println(apple + " " + apple.getPrice());
        }

    }
}
