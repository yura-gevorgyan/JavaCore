package classwork.chapter14.overridedemo;

public class Gen <T>{

    T ob;

    Gen(T o){
        ob = o;
    }

    T getOb(){
        System.out.println("Method getOb() in class Gen");
        return ob;
    }


}
