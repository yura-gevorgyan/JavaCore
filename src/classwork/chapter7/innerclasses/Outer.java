package classwork.chapter7.innerclasses;

public class Outer {
    int outerX = 100;

    void test(){
        Inner inner = new Inner();
        inner.display();
    }

    class  Inner {
        int y = 10;
        void display(){
            System.out.println("outerX = " + outerX);
        }
    }

    void test1(){
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display(){
                    System.out.println("outerX = " + outerX);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }

        //    void showY(){
        //        System.out.println(y);
        //    }
}
