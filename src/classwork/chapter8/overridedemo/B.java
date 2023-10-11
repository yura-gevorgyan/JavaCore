package classwork.chapter8.overridedemo;

public class B extends A{

    int k;
    B(int x ,int y ,int c){
        super(x,y);
        k = c;
    }


//    void show() {
//        System.out.println("K: " + k);
//    }

    void show(){
        super.show();
        System.out.println("K: " + k);
    }

    void show(String msg ){
        System.out.println(msg + k);
    }
}
