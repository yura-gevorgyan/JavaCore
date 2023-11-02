package classwork.chapter9.defaultmethoddemo;

public class MyIFImp2 implements MyIF{
    @Override
    public int getNumber() {
        return 100;
    }

    @Override
    public String getString() {
        return "Default Method getString() in class";
    }
}
