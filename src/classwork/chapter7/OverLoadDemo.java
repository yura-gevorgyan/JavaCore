package classwork.chapter7;

public class OverLoadDemo {
    public static void main(String[] args) {
        Overload ob = new Overload();
        double result;
        int i = 88;

        ob.test();
        ob.test(10);
        ob.test(10,20);
        result = ob.test(123.25);
        System.out.println("Result = ob.test(123.25): " + ob.test(123.4));

        ob.test(i);




    }
}
