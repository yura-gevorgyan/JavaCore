package homeworks.arrayutil;

import homeworks.arrayutil.ArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        arrayUtil.setNumbers(1, 2, 3, 4, 9, 80, 90, 60, 80, 12, 45);
        arrayUtil.lastNum();
    }
}
