package classwork.chapter7.overload;

public class Overload {

    void test() {
        System.out.println("You do not have ");
    }

    void test(int a) {
        System.out.println("a: " + a);
    }

    void test(int a, int b) {
        System.out.println("a and b: " + a + " " + b);
    }

    double test(double a){
        System.out.println("a: " + a);
        return a*a;
    }
}
