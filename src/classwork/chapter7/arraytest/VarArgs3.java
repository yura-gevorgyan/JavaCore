package classwork.chapter7.arraytest;

public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("vaTest(int ... v) " + v.length + " Array numbers : ");
        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest(String msg , int ... v) " + msg + v.length + " Array numbers: ");
        for (int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean ... v) " + v.length + " Array : ");
        for (boolean x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, true);
        vaTest("String");
    }
}
