package homeworks.arrayutil;

import homeworks.arrayutil.ArrayUtil;

import java.util.Scanner;

public class ArrayUtilTest {
    public static void main(String[] args) {


        ArrayUtil arrayUtil = new ArrayUtil();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input NUMBERS divided by \",\"");
        String number = scanner.nextLine();
        String[] split = number.split(",");
        int[] numbers = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            numbers[i] = Integer.parseInt(split[i]);
        }
        arrayUtil.setNumbers(numbers);


        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for PRINT FIRST NUMBER");
            System.out.println("Please input 2 for PRINT LAST NUMBER");
            System.out.println("Please input 3 for PRINT LENGTH");
            System.out.println("Please input 4 for PRINT MINIMUM NUMBER");
            System.out.println("Please input 5 for PRINT MAXIMUM NUMBER");
            System.out.println("Please input 6 for PRINT MIDDLE NUMBER");
            System.out.println("Please input 7 for PRINT EVEN NUMBER");
            System.out.println("Please input 8 for PRINT ODD NUMBER");
            System.out.println("Please input 9 for PRINT SUM OF NUMBERS");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    arrayUtil.firstNum();
                    break;
                case "2":
                    arrayUtil.lastNum();
                    break;
                case "3":
                    arrayUtil.length();
                    break;
                case "4":
                    System.out.println("Minimum number: " + arrayUtil.minNum());
                    break;
                case "5":
                    System.out.println("Maximum number: " + arrayUtil.maxNum());
                    break;
                case "6":
                    arrayUtil.middleNum();
                    break;
                case "7":
                    arrayUtil.evenNum();
                    break;
                case "8":
                    arrayUtil.oddNum();
                    break;
                case "9":
                    System.out.println("Sum of numbers: " + arrayUtil.sum());
            }
        }
    }
}
