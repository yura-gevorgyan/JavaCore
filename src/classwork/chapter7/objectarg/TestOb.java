package classwork.chapter7.objectarg;

import classwork.chapter7.objectarg.Test;

public class TestOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100,22);
        Test ob2 = new Test(100,22);
        Test ob3 = new Test(-1,-1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob2 == ob3: " + ob2.equalTo(ob3));
    }
}