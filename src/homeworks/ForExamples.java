package homeworks;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 1; i < 1001; i++) {
            System.out.print(i + "-");
            if (i == 1000) {
                System.out.println("\b");
            }
        }
        System.out.println();
        System.out.println();

        for (int j = 1; j < 101; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }

        System.out.println();
        System.out.println();

        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int y = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > y) {
                y = array[i];
            }
        }
        System.out.println(y);

    }

}


