package classwork.chapter9.stackdemo;

public class IFTest {

    public static void main(String[] args) {

        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for (int i = 0; i < 5; i++) {
            myStack1.push(i);
        }

        for (int i = 0; i < 8; i++) {
            myStack2.push(i);
        }

        System.out.print("MyStack1: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.print("MyStack2: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
