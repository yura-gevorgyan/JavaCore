package classwork.chapter8.boxdemo;


public class BoxWeight extends Box {
    double weight;

    BoxWeight(double w, double h, double d, double weight) {
        width = w;
        height = h;
        depth = d;
        this.weight = weight;
    }

    BoxWeight(double len, double weight) {
        super(len);
        this.weight = weight;
    }

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }
}
