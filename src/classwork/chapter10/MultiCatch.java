package classwork.chapter10;

public class MultiCatch {

    public static void main(String[] args) {
        int a = 10, b = 0;
        int[] val = {1, 2, 3};

        try {
            int result = a/b;
            val[10] = 19;
        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
