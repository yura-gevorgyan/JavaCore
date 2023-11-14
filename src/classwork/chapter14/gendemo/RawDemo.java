package classwork.chapter14.gendemo;

public class RawDemo {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);

        Gen<String> strOb = new Gen<>("Testing");

        Gen raw = new Gen(new Double(98.6));

        double d = (Double) raw.getOb();
        System.out.println(d);

        //int i = (Integer) iOb.getOb();
        int i = iOb.getOb();


    }
}
