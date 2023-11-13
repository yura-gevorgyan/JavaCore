package classwork.chapter14.gendemo;

public class NonGen {

    Object ob;

    NonGen(Object o) {
        ob = o;
    }

    Object getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Object: " + ob.getClass().getName());
    }
}
