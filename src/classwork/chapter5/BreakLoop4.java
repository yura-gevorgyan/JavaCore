package classwork.chapter5;

public class BreakLoop4 {
    public static void main(String[] args) {
        outler:
        for (int i = 0; i < 3; i++) {
            System.out.print("First For " + i + ": ");
            for (int j = 0; j < 100; j++) {
                if (j == 10){
                    break outler;
                }
                System.out.print(j + " ");
            }
            System.out.println("This code do not work");
        }
        System.out.println("First For is finish");
    }

}
