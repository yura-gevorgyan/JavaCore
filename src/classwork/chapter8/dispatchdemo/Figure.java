package classwork.chapter8.dispatchdemo;

public class Figure {

    double sim1;
    double sim2;

    Figure(double a, double b){

        sim1 = a;
        sim2 = b;

    }

    double area(){
        System.out.println("Wrong Figure");
        return 0;
    }
}
