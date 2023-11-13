package classwork.chapter14.gendemo;

public class SimpGen {

    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88, "Testing");

        tgObj.showType();

        int v = tgObj.getOb1();
        System.out.println("V: " + v);

        String str = tgObj.ob2;
        System.out.println("str: " + str);
    }
}
