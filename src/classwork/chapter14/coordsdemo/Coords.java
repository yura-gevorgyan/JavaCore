package classwork.chapter14.coordsdemo;

public class Coords<T extends TwoD> {

    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}
