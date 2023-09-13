package classwork.chapter6;

public class Box {
    double widht;
    double height;
    double depth;

    void volume() {
        System.out.print("Volume: ");
        System.out.println(widht * height * depth);
    }

    double volume2() {
        return widht * height * depth;
    }

    void setDim(double w, double h, double d) {
        widht = w;
        height = h;
        depth = d;
    }
}
