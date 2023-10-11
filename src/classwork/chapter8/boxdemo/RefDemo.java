package classwork.chapter8.boxdemo;

public class RefDemo {

    public static void main(String[] args) {
        BoxWeight boxWeight = new BoxWeight(3, 5, 7, 8.37);
        Box myBox1 = new Box();

        System.out.println("Volume boxWeight: " + boxWeight.volume());
        System.out.println("Weight boxWeight: " + boxWeight.weight);

        myBox1 = boxWeight;
        System.out.println("Volume myBox1: " + myBox1.volume());
        //System.out.println("Weight myBox1: " + myBox1.weight);
    }
}
