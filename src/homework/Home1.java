package homework;

public class Home1 {
    public static void main(String[] args) {
        // first 
        for (int i = 0; i < 7; i++) {
            System.out.println("******");
        }
        System.out.println();
        // second
        char ch ='*';
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
