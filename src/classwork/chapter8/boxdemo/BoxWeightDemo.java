package classwork.chapter8.boxdemo;

public class BoxWeightDemo {

    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight myBox2 = new BoxWeight(2,3,4,0.076);

        System.out.println("Volume myBox1: " + myBox1.volume());
        System.out.println("Weight myBox1: " + myBox1.weight);
        System.out.println("Volume myBox2: " + myBox2.volume());
        System.out.println("Weight myBox2: " + myBox2.weight);
    }
}
