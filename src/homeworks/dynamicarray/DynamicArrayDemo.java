package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i < 100; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        System.out.println(dynamicArray.getByIndex(30));
        System.out.println(dynamicArray.getByIndex(99));
        System.out.println(dynamicArray.getByIndex(-1));
    }

}
