package classwork.chapter14.gendemo;

public class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("T: " + ob.getClass().getName());
    }
}
