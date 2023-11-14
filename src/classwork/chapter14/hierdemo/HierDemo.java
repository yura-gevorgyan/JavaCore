package classwork.chapter14.hierdemo;

public class HierDemo {

    public static void main(String[] args) {

        Gen<String> w = new Gen<>("Hello" , 47);

        System.out.println(w.getOb() + " " + w.getNum());
    }
}
