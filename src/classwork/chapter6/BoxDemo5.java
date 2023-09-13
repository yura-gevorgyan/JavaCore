package classwork.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {
        Box myBox = new Box();
        Box myBox2 = new Box();


        myBox.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);

        System.out.println("Volume myBox: " + myBox.volume2());

        System.out.println("Volume myBox2: " + myBox2.volume2());
    }
}
