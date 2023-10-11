package classwork.chapter8.extendsdemo;

public class SimpleInheritance {

    public static void main(String[] args) {
        A superOb = new A();
        B supOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        superOb.showIJ();

        supOb.i = 7;
        supOb.j = 8;
        supOb.k = 9;

        supOb.showIJ();
        supOb.showK();
        supOb.sum();
    }
}
