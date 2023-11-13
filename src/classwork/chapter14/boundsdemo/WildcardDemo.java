package classwork.chapter14.boundsdemo;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<>(integers);
        double v = iOb.average();
        System.out.println("iOb Avg: " + v);

        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<>(doubles);
        double w = dOb.average();
        System.out.println("dOb avg: " + w);

        Float[] floats = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fOb = new Stats<>(floats);
        double f = fOb.average();
        System.out.println("fOb avg: " + f);

        System.out.print("iOb and dOb ");
        if (iOb.sameAvg(dOb)) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

        System.out.print("iOb and fOb ");
        if (iOb.sameAvg(fOb)) {
            System.out.println("==");
        } else {
            System.out.println("!=");
        }

    }
}
