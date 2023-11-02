package classwork.chapter9.stackdemo;

public class IFTest3 {

    public static void main(String[] args) {
        
        IntStack myStack;
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(5);
        
        myStack = ds;
        for (int i = 0; i < 12; i++) {
            myStack.push(i);
        }

        myStack = fs;
//        for (int i = 0; i < 8; i++) {
//            myStack.push(i);
//        }

        myStack = ds;
        System.out.println("DynStack: ");
        for (int i = 0; i < 12; i++) {
            System.out.print(myStack.pop() + " ");
        }

        myStack = fs;
        System.out.println("Stack: ");
        for (int i = 0; i < 8; i++) {
            System.out.print(myStack.pop() + " ");
        }
    }
}
