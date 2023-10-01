package homeworks.bracechecker;

public class Stack {
    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    void push(int item) {
        if (index == array.length - 1) {
            extend();
        } else {
            array[++index] = item;
        }

    }

    private void extend() {
        int[] numbers = new int[array.length + 10];
        System.arraycopy(array, 0, numbers, 0, array.length);
        array = numbers;
    }


    int pop() {
        if (index < 0) {
            return 0;
        } else {
            return array[index--];
        }
    }
}
