package classwork.chapter7.recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Recursion recursion = new Recursion(10);

        for (int i = 0; i < 10; i++) {
            recursion.values[i] = i;
        }

        recursion.printArray(10);
    }
}
