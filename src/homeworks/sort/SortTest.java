package homeworks.sort;

public class SortTest {
    public static void main(String[] args) {
        Sort sort = new Sort();
        sort.setArray(1, 2, 3, 55, 5, 666, 45747);
        sort.sortFromMax();
        sort.sortFromMin();
    }
}
