package classwork.chapter7;

public class BoxOverLoad2 {
    public static void main(String[] args) {
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myCube = new Box(7);

        Box myClone = new Box(myBox1);

        System.out.println("Volume myBox1: " + myBox1.volume());
        System.out.println("Volume myBox2: " + myBox2.volume());
        System.out.println("Volume myCube: " + myCube.volume());
        System.out.println("Volume myCLone: " + myClone.volume());
    }
}
