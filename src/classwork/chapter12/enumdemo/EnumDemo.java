package classwork.chapter12.enumdemo;

public class EnumDemo {

    public static void main(String[] args) {

        Apple ap;

        ap = Apple.REDDEL;

        System.out.println(ap);
        System.out.println();

        ap = Apple.GOLDENDEL;

        if (ap == Apple.GOLDENDEL) {
            System.out.println(ap);
        }

        switch (ap) {
            case JONATHAN:
                System.out.println(Apple.JONATHAN);
                break;
            case GOLDENDEL:
                System.out.println(Apple.GOLDENDEL);
                break;
            case REDDEL:
                System.out.println(Apple.REDDEL);
                break;
            case WINESAP:
                System.out.println(Apple.WINESAP);
                break;
            case CORTLAND:
                System.out.println(Apple.CORTLAND);
                break;

        }
    }
}
