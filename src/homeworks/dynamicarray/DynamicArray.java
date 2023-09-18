package homeworks.dynamicarray;

public class DynamicArray {
    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];

    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;
    private int lastCount = 0;





    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {

        if (size == array.length - 1) {
            extend();
            array[size++] = value;

        } else {
            array[size++] = value;
        }
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] numbers = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            numbers[i] = array[i];
        }
        array = numbers;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        } else {
            System.out.print("Your index is out of size array ");
            return -1;
        }

    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        System.out.print("All numbers in array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("New add numbers: ");
        for (int i = lastCount; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        lastCount = size;
    }
}
