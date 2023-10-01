package homeworks.arrayutil;

public class ArrayUtil {
    private int[] numbers;

    public void setNumbers(int... array) {
        numbers = new int[array.length];
        System.arraycopy(array, 0, numbers, 0, array.length);
    }


    void arrayPrint() {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    void firstNum() {
        System.out.println("First number in array is " + numbers[0]);
    }

    void lastNum() {
        System.out.println("Last number in array is " + numbers[numbers.length - 1]);
    }

    void length() {
        System.out.println("Array length is " + numbers.length);
    }

    double minNum() {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    double maxNum() {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    void middleNum() {
        if (numbers.length > 2) {
            if (numbers.length % 2 == 0) {
                System.out.print("Middle numbers in array are" + numbers[(numbers.length / 2) - 1] + " ");
                System.out.println(numbers[(numbers.length / 2)]);
            } else {
                System.out.println("Middle number in array is " + numbers[((numbers.length - 1) / 2)]);
            }
        } else {
            System.out.println("Can't print middle values");
        }
    }

    void evenNum() {
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
                evenCount++;
            }
        }
        System.out.print("Even number Count: " + evenCount);
        System.out.println();
    }

    void oddNum() {
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
                oddCount++;
            }

        }
        System.out.print("Odd number Count: " + oddCount);
        System.out.println();
    }

    double sum() {
        double result = 0.0;
        for (int j = 0; j < numbers.length; j++) {
            result += numbers[j];
        }
        return result;
    }

}
