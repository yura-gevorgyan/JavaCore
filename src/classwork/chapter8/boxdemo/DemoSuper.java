package classwork.chapter8.boxdemo;

public class DemoSuper {

    public static void main(String[] args) {
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);

        System.out.println("Volume myBox1: " + myBox1.volume());
        System.out.println("Weight myBox1: " + myBox1.weight);

        System.out.println("Volume myBox2: " + myBox2.volume());
        System.out.println("Weight myBox2: " + myBox2.weight);

        System.out.println("Volume myBox3: " + myBox3.volume());
        System.out.println("Weight myBox3: " + myBox3.weight);

        System.out.println("Volume myCube: " + myCube.volume());
        System.out.println("Weight myCube: " + myCube.weight);

        System.out.println("Volume myClone: " + myClone.volume());
        System.out.println("Weight myClone: " + myClone.weight);
    }
}
