package classwork.chapter8.abstractdemo;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Triangle: ");
        return sim1 * sim2 / 2;
    }
}
