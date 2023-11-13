package classwork.chapter14.gendemo;

public class TwoGen<T, V> {
    T ob1;
    V ob2;

    TwoGen(T o, V o2) {
        ob1 = o;
        ob2 = o2;
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("T: " + ob1.getClass().getName());
        System.out.println("V: " + ob2.getClass().getName());
    }
}
