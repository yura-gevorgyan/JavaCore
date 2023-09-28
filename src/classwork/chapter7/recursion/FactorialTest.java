package classwork.chapter7.recursion;

import classwork.chapter7.recursion.Factorial;

public class FactorialTest {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        System.out.println("Factorial 5 is" + factorial.fact(5));
        System.out.println("Factorial 4 is" + factorial.fact(4));
        System.out.println("Factorial 3 is" + factorial.fact(3));
    }
}
