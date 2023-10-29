package classwork.chapter9.nestedifdemo;

public class NestedIfDemo {

    public static void main(String[] args) {
        A.NestedIf nestedIf = new B();

        if (nestedIf.isNotNegative(10)){
            System.out.println("We see this code");
        }

        if (nestedIf.isNotNegative(-12)){
            System.out.println("We do not see this code");
        }
    }
}
