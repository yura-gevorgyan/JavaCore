package classwork.chapter7.arraytest;

public class VarArgs {

    static void vaTest(int ... v){
        System.out.print("Array length is " + v.length + " Array numbers : ");
        for (int x : v) {
            System.out.print(x + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
