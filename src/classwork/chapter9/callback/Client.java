package classwork.chapter9.callback;

public class Client implements CallBack{
    @Override
    public void callback(int param) {
        System.out.println("Method callback(): " + param);
    }

    void nonIfaceMeth(){
        System.out.println("Method in class Client");
    }
}
