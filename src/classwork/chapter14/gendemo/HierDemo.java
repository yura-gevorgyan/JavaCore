package classwork.chapter14.gendemo;

public class HierDemo {

    public static void main(String[] args) {
        Gen2<String,Integer> x = new Gen2<>("Testing" , 88);

        System.out.println(x.getOb());
        System.out.println(x.getOb2());
    }
}
