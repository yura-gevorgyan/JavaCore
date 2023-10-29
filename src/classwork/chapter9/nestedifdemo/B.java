package classwork.chapter9.nestedifdemo;

public class B implements A.NestedIf {
    @Override
    public boolean isNotNegative(int x) {
        return x < 0 ? false : true;
    }

//    if(x < 0){
//        return false;
//    }else{
//        return true;
//    }

}
