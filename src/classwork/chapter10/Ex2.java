package classwork.chapter10;

public class Ex2 {

    public static void main(String[] args) {

        int a, d;

        try {
            d = 0;
            a = 42 / d;
            System.out.println("That code is wrong");
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Code after catch");
    }
}
