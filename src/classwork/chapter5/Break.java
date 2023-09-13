package classwork.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Break ");
                    if (t){
                        break second;
                    }
                    System.out.println("This code do not work");
                }

                System.out.println("This code do not work");
            }
            System.out.println("This is FIRST code");

        }
    }
}
