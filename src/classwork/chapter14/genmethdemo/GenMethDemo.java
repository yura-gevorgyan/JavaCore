package classwork.chapter14.genmethdemo;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5};

        if (isIn(2, nums)) {
            System.out.println("2");
        }

        if (!isIn(7, nums)) {
            System.out.println("!7");
        }

        System.out.println();

        String[] str = {"one", "two", "three", "four", "five"};

        if (isIn("two", str)) {
            System.out.println("two");
        }

        if (!isIn("seven", str)) {
            System.out.println("!seven");
        }

        // if (isIn("two" ,nums))
    }
}
