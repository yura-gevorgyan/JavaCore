package classwork.chapter6;

public class BoxDemo {
    public static void main(String[] args) {
       Box myBox = new Box();
       double vol ;

       myBox.widht = 10;
       myBox.height = 20;
       myBox.depth = 15;

       vol = myBox.widht * myBox.height * myBox.depth;

        System.out.println("Volume: " + vol);

    }
}
