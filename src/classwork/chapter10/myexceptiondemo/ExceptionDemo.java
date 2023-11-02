package classwork.chapter10.myexceptiondemo;

public class ExceptionDemo {

    static void compute(int a) throws MyException {
        System.out.println("Method compute(" + a + ")");
        if (a > 10) {
            throw new MyException(a);
        }
        System.out.println("Finish !!!");
    }

    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
