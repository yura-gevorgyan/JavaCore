package classwork.chapter8.abstractdemo;

public class AbstractAreas {

    public static void main(String[] args) {
       //  Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        System.out.println(r.area());
        System.out.println(t.area());
    }
}
