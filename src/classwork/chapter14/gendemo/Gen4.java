package classwork.chapter14.gendemo;

public class Gen4 extends Gen<String> {

    Gen4(String o) {
        super(o);
    }

    String getOb() {
        System.out.println("Method String getOb() in class Gen4");
        return ob;
    }
}
