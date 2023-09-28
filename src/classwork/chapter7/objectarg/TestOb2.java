package classwork.chapter7.objectarg;

import classwork.chapter7.objectarg.Test;

public class TestOb2 {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a and b: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a and b after method: " + a + " " + b);

    }
}
