package classwork.chapter6;

public class Stack {
    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == array.length - 1) {
            System.out.println("Stack is full");
        } else {
            array[++index] = item;
        }

    }

    int pop() {
        if (index < 0) {
            System.out.println("Stack is empty");
            return 0;
        } else {
            return array[index--];
        }
    }
}
