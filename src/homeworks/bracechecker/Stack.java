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
        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i];
        }
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
