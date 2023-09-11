package classwork.chapter5;

public class Menu {
    public static void main(String[] args)
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Operator help");
            System.out.println("    1: If");
            System.out.println("    2: Switch");
            System.out.println("    3: While");
            System.out.println("    4: Do-While");
            System.out.println("    5: For\n");
            System.out.println("Enter\n");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("If:");
                System.out.println("if(){...}" +
                        " else{....}");
                break;
            case '2':
                System.out.println("Switch: ");
                System.out.println("switch(){");
                System.out.println("   case ... :");
                System.out.println("      ........ ");
                System.out.println("       break;");
                System.out.println("}");
                break;
            case '3':
                System.out.println("While: ");
                System.out.println("while(...) {");
                System.out.println("    .....");
                System.out.println(" }");
                break;
            case '4':
                System.out.println("Do-While: ");
                System.out.println("do {");
                System.out.println("  ......");
                System.out.println("} while(...) {");
                System.out.println("      ......");
                System.out.println("}");
                break;
            case '5':
                System.out.println("For: ");
                System.out.println("for(... , ... , ...) {");
                System.out.println("      ......");
                System.out.println("}");
                break;
        }
    }
}
