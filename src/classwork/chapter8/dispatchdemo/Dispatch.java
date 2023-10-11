package classwork.chapter8.dispatchdemo;

public class Dispatch {

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;      // class A
        r.callMe();

        r = b;      // class B
        r.callMe();

        r = c;     // class C
        r.callMe();
    }
}
