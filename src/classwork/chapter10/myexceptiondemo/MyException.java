package classwork.chapter10.myexceptiondemo;

public class MyException extends Exception{

    private int detail;

    MyException(int detail){
        this.detail = detail;
    }

    public String toString(){
        return "MyException [" + detail + "]";
    }
}
