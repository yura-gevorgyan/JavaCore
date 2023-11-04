package classwork.chapter12.autobox;

public class Wrap {

    public static void main(String[] args) {
        Integer iOb = new Integer(100);

        int i = iOb.intValue();

        System.out.println(iOb + " " + i);
    }
}
