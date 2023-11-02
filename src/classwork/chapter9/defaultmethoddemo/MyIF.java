package classwork.chapter9.defaultmethoddemo;

public interface MyIF {

    int getNumber();

    default String getString(){
        return "Default Method getString()";
    }
}
