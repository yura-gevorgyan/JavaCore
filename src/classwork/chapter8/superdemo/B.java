package classwork.chapter8.superdemo;

public class B extends A{

    int i;

    B(int x, int y ){
        super.i = x; // Class A
        i = y;  // Class B
    }

    void show(){
        System.out.println("Super I: " + super.i);
        System.out.println("I in Class B: " + i);
    }

}
