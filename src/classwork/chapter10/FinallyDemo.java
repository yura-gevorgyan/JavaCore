package classwork.chapter10;

public class FinallyDemo {

    static void proCA() {
        try {
            System.out.println("Method proCA()");
            throw new RuntimeException();
        } finally {
            System.out.println("Finally in method proCA()");
        }
    }

    static void proCB() {
        try {
            System.out.println("Method proCA()");
            return;
        } finally {
            System.out.println("Finally in method proCB()");
        }
    }

    static void proCC() {
        try {
            System.out.println("Method proCC()");
        } finally {
            System.out.println("Finally in method proCA()");
        }
    }

    public static void main(String[] args) {
        try {
            proCA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        proCB();
        proCC();
    }
}
