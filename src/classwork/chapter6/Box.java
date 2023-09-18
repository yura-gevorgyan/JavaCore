package classwork.chapter6;

public class Box {
    double widht;
    double height;
    double depth;

//    Box() {
//        System.out.println("Construction of the Box object");
//        widht = 10;
//        height = 10;
//        depth = 10;
//    }

    Box(double widht, double height, double depth) {
        this.widht = widht;
        this.height = height;
        this.depth = depth;
    }

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
