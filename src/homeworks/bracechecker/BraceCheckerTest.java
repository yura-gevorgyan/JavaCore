package homeworks.bracechecker;

import java.util.Scanner;

public class BraceCheckerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write Text");
        String text = scanner.nextLine();
        BraceChecker bc = new BraceChecker(text);

        boolean isRun = true;
        while (isRun){
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for CHECK");
            String command = scanner.nextLine();
            switch (command){
                case "0":
                    isRun = false;
                    break;
                case "1":
                    bc.check();
                    isRun = false;
                    break;
            }
        }

    }
}
