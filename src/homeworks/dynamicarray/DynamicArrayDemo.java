package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i < 11; i++) {
            dynamicArray.add(i);
        }

        System.out.println(dynamicArray.getByIndex(9));
        System.out.println(dynamicArray.getByIndex(10));
        System.out.println(dynamicArray.getByIndex(-1));

        dynamicArray.print();

        dynamicArray.add(6);
        dynamicArray.add(93);
        dynamicArray.add(76);

        dynamicArray.print();
    }

}
