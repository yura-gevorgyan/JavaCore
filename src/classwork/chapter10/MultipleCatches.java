package classwork.chapter10;

public class MultipleCatches {

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            int[] c = {1};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
