package homeworks.sort;

import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sort sort = new Sort();
        System.out.println("Please input NUMBERS divided by \",\"");
        String number = scanner.nextLine();
        String [] array = number.split(",");
        int[] numbers = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = Integer.parseInt(array[i]);
        }
        sort.setArray(numbers);

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for SORT FROM MINIMUM");
            System.out.println("Please input 2 for SORT FROM MAXIMUM");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    sort.sortFromMin();
                    break;
                case "2":
                    sort.sortFromMax();
                    break;
            }
        }
    }
}
