package classwork.chapter10;

public class ChainExcDemo {

    static void demoProC(){
        NullPointerException nullPointerException = new NullPointerException("First");

        nullPointerException.initCause(new ArithmeticException("Second"));

        throw nullPointerException;
    }

    public static void main(String[] args) {
        try {
            demoProC();
        }catch (NullPointerException e){
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}
