package classwork.chapter14.gendemo;

public class NonGenDemo {

    public static void main(String[] args) {
        NonGen iOb;

        iOb = new NonGen(88);

        iOb.showType();

        int v = (Integer) iOb.getOb();
        System.out.println("V: " + v);

        NonGen strOb = new NonGen("Testing");

        strOb.showType();

        String str = (String) strOb.getOb();
        System.out.println("str: " + str);
    }
}
