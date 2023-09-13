package classwork.chapter6;

public class SquareTest {
    public static void main(String[] args) {
        Square sq = new Square();
        System.out.println(sq.square(3));
        double x= 0;
        x = sq.square(5);
        System.out.println(x);
        x = sq.square(9);
        System.out.println(x);
        double y = 7;
        x = sq.square(y);
        System.out.println(x);
    }
}
