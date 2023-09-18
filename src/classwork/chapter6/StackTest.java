package classwork.chapter6;

public class StackTest {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for (int i = 0; i < 10; i++) {
            myStack1.push(i);
        }

        for (int i = 10; i < 20; i++) {
            myStack2.push(i);
        }

        System.out.print("myStack: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack1.pop() + " ");
        }

        System.out.println();

        System.out.print("myStack2: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(myStack2.pop() + " ");
        }
    }
}
