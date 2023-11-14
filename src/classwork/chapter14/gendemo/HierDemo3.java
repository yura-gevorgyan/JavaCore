package classwork.chapter14.gendemo;

public class HierDemo3 {

    public static void main(String[] args) {

        Gen<Integer> iOb = new Gen<>(88);
        Gen3<Integer> iOb3 = new Gen3<>(99);

        Gen3<String> strOb = new Gen3<>("Testing");

        if (iOb3 instanceof Gen3<?>){
            System.out.println("iOb3 is Gen3");
        }

        if (iOb3 instanceof Gen<?>) {
            System.out.println("iOb3 is Gen");
        }

        if (strOb instanceof Gen3<?>) {
            System.out.println("strOb is Gen3");
        }

        if (strOb instanceof Gen<?>) {
            System.out.println("strOb is Gen");
        }

        if (iOb instanceof Gen3<?>){
            System.out.println("iOb is Gen3");
        }

        if (iOb instanceof Gen<?>) {
            System.out.println("iOb is Gen");
        }
    }
}
