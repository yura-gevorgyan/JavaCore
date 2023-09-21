package homeworks.dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();

        for (int i = 1; i < 11; i++) {
            dynamicArray.add(i);
        }

        dynamicArray.print();

        dynamicArray.add(309);
        dynamicArray.add(34);
        dynamicArray.add(3);
        dynamicArray.add(7);
        dynamicArray.add(77);
        dynamicArray.add(9);

        dynamicArray.printNewAddValues();

        dynamicArray.printNewAddValues();


        System.out.println(dynamicArray.getByIndex(-1));
        System.out.println(dynamicArray.getByIndex(100));
        System.out.println(dynamicArray.getByIndex(4));

        dynamicArray.deleteByIndex(6);
        dynamicArray.deleteByIndex(-1);
        dynamicArray.deleteByIndex(100);
        dynamicArray.print();

        dynamicArray.set(3,66);
        dynamicArray.set(-1,77);
        dynamicArray.set(100,77);
        dynamicArray.print();

        dynamicArray.add(6,101);
        dynamicArray.add(-1,727);
        dynamicArray.add(112,6161);
        dynamicArray.print();

        System.out.println(dynamicArray.exists(4));
        System.out.println(dynamicArray.exists(9));

        System.out.println(dynamicArray.getIndexByValue(9));
        System.out.println(dynamicArray.getIndexByValue(999));



    }

}
