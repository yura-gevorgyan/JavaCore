package classwork.chapter8.dispatchdemo;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Triangle");
        return sim1 * sim2 / 2;
    }
}
