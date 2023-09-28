package classwork.chapter7.staticdemo;

public class UseStatic {

    static int a = 3;
    static int b;

    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    static {
        b = a * 4;
    }

    public static void main(String [] args){
        meth(42);
    }
}
