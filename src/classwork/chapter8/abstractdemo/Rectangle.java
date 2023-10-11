package classwork.chapter8.abstractdemo;

public class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Rectangle: ");
        return sim1 * sim2;
    }
}
