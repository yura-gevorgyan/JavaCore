package homeworks.dynamicarray;

public class DynamicArray {

    private int[] array = new int[10];

    private int size = 0;
    private int lastCount = 0;

    public void add(int value) {

        if (size == array.length - 1) {
            extend();
            array[size++] = value;

        } else {
            array[size++] = value;
        }
    }

    private void extend() {
        int[] numbers = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i];
        }
        array = numbers;
    }

    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.print("Your index is out of size array ");
            return -1;
        }

    }


    public void print() {
        System.out.print("All numbers in array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printNewAddValues() {
        if (lastCount == size) {
            System.out.println("You do not have new add numbers");
        } else {
            System.out.print("New add numbers: ");
            for (int i = lastCount; i < size; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
            lastCount = size;
        }

    }

    public void deleteByIndex(int index) {
        if (index >= 0 && index < size) {
            for (int j = index; j < size - 1; j++) {
                array[j] = array[j + 1];
            }
            size--;
        } else {
            System.out.println("Your add index is out of size");
        }

    }

    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("Your add index is out of size");
        }
    }

    public void add(int index, int value) {
        if (index >= 0 && index < size) {
            size++;
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = value;
        } else {
            System.out.println("Your add index is out of size");
        }


    }


    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {

        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;

    }
}
