package classwork.chapter14.overridedemo;

public class Gen2<T> extends Gen<T>{

    Gen2(T o) {
        super(o);
    }

    T getOb(){
        System.out.println("Method getOb() in class gen2");
        return ob;
    }
}
