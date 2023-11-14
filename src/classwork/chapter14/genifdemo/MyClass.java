package classwork.chapter14.genifdemo;

public class MyClass<T extends Comparable<T>> implements MinMax<T> {

    T[] val;

    MyClass(T[] o) {
        val = o;
    }

    @Override
    public T min() {
        T v = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i].compareTo(v) < 0) {
                v = val[i];
            }
        }
        return v;
    }

    @Override
    public T max() {
        T v = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i].compareTo(v) > 0) {
                v = val[i];
            }
        }
        return v;
    }
}
