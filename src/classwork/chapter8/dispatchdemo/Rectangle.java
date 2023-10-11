package classwork.chapter8.dispatchdemo;

public class Rectangle extends Figure {


    Rectangle(double a, double b) {
        super(a, b);
    }


    double area() {
        System.out.println("Rectangle: ");
        return sim1 * sim2;
    }
}
