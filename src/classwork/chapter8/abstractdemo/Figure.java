package classwork.chapter8.abstractdemo;

abstract class Figure {

    double sim1;
    double sim2;


    Figure(double a, double b) {
        sim1 = a;
        sim2 = b;

    }

    abstract double area();
}
