package classwork.chapter7.staticdemo;

import classwork.chapter7.staticdemo.StaticDemo;

public class StaticByName {
    public static void main(String[] args) {
        StaticDemo.callMe();
        System.out.println("b = " + StaticDemo.b);
    }
}
