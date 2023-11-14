package classwork.chapter14.hierdemo;

public class Gen<T> extends NoGen {
    T ob;

    Gen(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
