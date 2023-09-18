package homeworks;

public class Sort {
    int[] array = new int[]{};

    void sortFromMin() {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int y = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = y;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    void sortFromMax() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int y = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = y;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
