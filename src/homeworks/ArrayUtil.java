package homeworks;

public class ArrayUtil {
    int[] numbers ;

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

    int evenNumCount() {
        int evenCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

    int oddNumCount() {
        int oddCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                oddCount++;
            }

        }
        return oddCount;
    }

    double sum() {
        double result = 0.0;
        for (int j = 0; j < numbers.length; j++) {
            result += numbers[j];
        }
        return result;
    }

}
