package homeworks.sort;

public class Sort {
    private int[] array;

    public void setArray(int ... array){
        this.array = new int[array.length];
        System.arraycopy(array,0,this.array,0,array.length);
    }

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
