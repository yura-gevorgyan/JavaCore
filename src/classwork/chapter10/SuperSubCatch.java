package classwork.chapter10;

public class SuperSubCatch {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42/a;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

//        catch (ArithmeticException ex){
//            System.out.println(ex.getMessage());
//        }
    }
}
