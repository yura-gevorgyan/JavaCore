package classwork.chapter10;

public class ThrowDemo {

    static void demoProc(){
        try {
            throw new NullPointerException("DemoProC");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());

            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            demoProc();
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
