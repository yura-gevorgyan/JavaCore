package classwork.chapter14.genifdemo;

public class GenIfDemo {

    public static void main(String[] args) {
        Integer[] integers = {3, 6, 2, 8, 6};
        Character[] characters = {'b', 'r', 'p', 'w'};

        MyClass<Integer> iOb = new MyClass<>(integers);
        MyClass<Character> cOb = new MyClass<>(characters);

        System.out.println("iOb min " +iOb.min());
        System.out.println("iOb max " + iOb.max());

        System.out.println("cOb min " + cOb.min());
        System.out.println("cOb max " + cOb.max());

    }
}
