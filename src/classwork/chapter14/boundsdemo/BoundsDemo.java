package classwork.chapter14.boundsdemo;

public class BoundsDemo {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(integers);

        double v = iOb.average();
        System.out.println("iOb Average: " + v);

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(doubles);

        double w = dOb.average();
        System.out.println("dOb average: " + w);

        // Stats<String> = new Stats<>();

    }
}
