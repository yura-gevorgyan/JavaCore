package homeworks.bracechecker;

public class BraceCheckerTest {

    public static void main(String[] args) {
        BraceChecker bc = new BraceChecker("(Hello) { world ] {");

        bc.check();
    }
}
