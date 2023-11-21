package homeworks.fileutil;

public interface Command {

    String FILE_SEARCH = "1";
    String CONTENT_SEARCH = "2";
    String FIND_LINES = "3";
    String PRINT_SIZE_OF_PACKAGE = "4";
    String CREATE_FILE_WITH_CONTENT = "5";

    static void printCommands(){
        System.out.println("Please input " + FILE_SEARCH + " for SEARCH FILE");
        System.out.println("Please input " + CONTENT_SEARCH + " for CONTENT SEARCH");
        System.out.println("Please input " + FIND_LINES + " for FIND LINES");
        System.out.println("Please input " + PRINT_SIZE_OF_PACKAGE + " for PRINT SIZE OF PACKAGE");
        System.out.println("Please input " + CREATE_FILE_WITH_CONTENT + " for CREATE FILE WITH CONTENT");
    }
}
