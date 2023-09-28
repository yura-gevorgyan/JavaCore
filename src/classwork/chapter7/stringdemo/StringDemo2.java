package classwork.chapter7.stringdemo;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "Firts";
        String strOb2 = "Second";
        String strOb3 = strOb1;

        System.out.println("Length strOb1 = " + strOb1.length());
        System.out.println("Index 3 in strOb2: " + strOb2.charAt(3));

        if(strOb1.equals(strOb2)){
            System.out.println("strOb1 == strOb2");
        }else {
            System.out.println("strOb1 != strOb2");
        }

        if (strOb1.equals(strOb3)){
            System.out.println("strOb1 == strOb3");
        }else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
