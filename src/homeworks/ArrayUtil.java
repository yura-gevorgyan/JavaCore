package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("First number in array is " + numbers[0]);

        System.out.println("Last number in array is " + numbers[numbers.length - 1]);

        System.out.println("Array length is " + numbers.length);

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum number in array is " + min);

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

        System.out.print("Even numbers in array are ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers in array are ");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                System.out.print(numbers[i] + " ");
            }

        }
        System.out.println();

        double result = 0.0;
        for (int j = 0; j < numbers.length; j++) {
            result += numbers[j];
        }
        System.out.println("Sum of numbers is " + result);
        System.out.println("Arithmetic average is " + result / numbers.length);
    }
}
