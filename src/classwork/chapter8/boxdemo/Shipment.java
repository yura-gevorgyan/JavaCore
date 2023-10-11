package classwork.chapter8.boxdemo;

public class Shipment extends BoxWeight {

    double cost;

    Shipment() {
        super();
        this.cost = -1;
    }

    Shipment(double w, double h, double d, double weight, double cost){
        super(w,h,d,weight);
        this.cost = cost;
    }

    Shipment(double len , double weight , double cost){
        super(len,weight);
        this.cost = cost;
    }

    Shipment(Shipment ob){
        super(ob);
        cost = ob.cost;
    }


}
