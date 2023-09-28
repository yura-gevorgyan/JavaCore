package homeworks.bracechecker;

public class Stack {
    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == 9) {
            System.out.println("Stack is full");
        } else {
            array[++index] = item;
        }

    }

    int arrayLength(){
        return index;
    }

    int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }
}
