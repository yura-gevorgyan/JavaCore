package classwork.chapter9.callback;

public class AnotherClient implements CallBack {
    @Override
    public void callback(int param) {
        System.out.println("Method callback() in class AnotherClient");
        System.out.println("p * p: " + (param * param));
    }
}
