package classwork.chapter7.arraytest;

public class VarArgs2 {

    static void vaTest(String msg, int... v) {
        System.out.print(msg + v.length + " Array numbers: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest("First array ", 10);
        vaTest("Second array ", 1, 2, 3);
        vaTest("Third array ");
    }
}
