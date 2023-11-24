package homeworks.fileanalyzer;

public interface Command {

    String EXIT = "0";
    String WORD_QUANTITY = "1";
    String TOTAL_WORD_COUNT ="2";
    String UNIQUE_WORD_COUNT = "3";
    String TOP_FREQUENT_WORD_COUNT = "4";
    String COUNT_WORD_OCCURRENCES = "5";

    static void printCommand(){
        System.out.println("Please input " + EXIT + " for EXIT");
        System.out.println("Please input " + WORD_QUANTITY + " for WORD QUANTITY");
        System.out.println("Please input " + TOTAL_WORD_COUNT + " for TOTAL WORD COUNT");
        System.out.println("Please input " + UNIQUE_WORD_COUNT + " for UNIQUE WORD COUNT");
        System.out.println("Please input " + TOP_FREQUENT_WORD_COUNT + " for TOP FREQUENT WORD COUNT");
        System.out.println("Please input " + COUNT_WORD_OCCURRENCES + " for COUNT WORD OCCURRENCES");
    }
}
