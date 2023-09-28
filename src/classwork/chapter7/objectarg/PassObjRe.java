package classwork.chapter7.objectarg;

public class PassObjRe {
    public static void main(String[] args) {
        Test1 test1 = new Test1(15, 20);

        System.out.println("test1.a and test1.b : " + test1.a + " " + test1.b);

        test1.meth(test1);
        System.out.println("test1.a and test1.b after method: " + test1.a + " " + test1.b);


    }
}
