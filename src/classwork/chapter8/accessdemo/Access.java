package classwork.chapter8.accessdemo;

public class Access {
    public static void main(String[] args) {
        B supOb = new B();

        supOb.setIJ(10, 20);
        System.out.println(supOb.total);
    }
}
