package classwork.chapter14.gendemo;

public class GenDemo {

    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();

        System.out.println("iOb: " + v);

        Gen<String> strOb = new Gen<>("Testing");

        strOb.showType();

        String str = strOb.getOb();

        System.out.println("strOb" + str);
    }
}
