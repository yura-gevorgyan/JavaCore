package classwork.chapter9.defaultmethoddemo;

public class DefaultMethodDemo {

    public static void main(String[] args) {

        MyIFImp ob = new MyIFImp();

        System.out.println(ob.getNumber());
        System.out.println(ob.getString());

        MyIFImp2 ob2 = new MyIFImp2();

        System.out.println(ob2.getNumber());
        System.out.println(ob2.getString());

    }
}
