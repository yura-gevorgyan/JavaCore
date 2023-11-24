package homeworks.fileanalyzer;

import java.util.Map;
import java.util.Scanner;

public class FileAnalyzerMain implements Command {

    static Scanner SCANNER = new Scanner(System.in);
    static FileAnalyzer fileAnalyzer = new FileAnalyzer();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Command.printCommand();
            String command = SCANNER.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case WORD_QUANTITY:
                    wordQuantityCommand();
                    break;
                case TOTAL_WORD_COUNT:
                    totalWordCountCommand();
                    break;
                case UNIQUE_WORD_COUNT:
                    uniqueWordCountCommand();
                    break;
                case TOP_FREQUENT_WORD_COUNT:
                    topFrequentWordCountCommand();
                    break;
                case COUNT_WORD_OCCURRENCES:
                    countWordOccurrencesCommand();
                    break;
                default:
                    System.out.println("Invalid command: Please try again");
            }
        }
    }

    private static void countWordOccurrencesCommand() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();
        System.out.println("Please input WORD");
        String word = SCANNER.nextLine();

        int i = fileAnalyzer.countWordOccurrences(filePath, word);

        if (i != 0) {
            System.out.println(word + ": " + i);
        }

    }

    private static void topFrequentWordCountCommand() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();
        System.out.println("Please input TOP");
        int top = Integer.parseInt(SCANNER.nextLine());

        Map<String, Integer> frequentWords = fileAnalyzer.topFrequentWords(filePath, top);
        int i = 0;

        if (frequentWords != null) {
            for (Map.Entry<String, Integer> frequentWordEntry : frequentWords.entrySet()) {
                System.out.println(frequentWordEntry.getKey() + ": " + frequentWordEntry.getValue());
                i++;
                if (i == top) {
                    break;
                }

            }
        }


    }

    private static void uniqueWordCountCommand() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();

        if (fileAnalyzer.uniqueWordCount(filePath) != 0) {
            System.out.println("Unique words count: " + fileAnalyzer.uniqueWordCount(filePath));
        }

    }

    private static void totalWordCountCommand() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();

        if (fileAnalyzer.totalWordCount(filePath) != 0) {
            System.out.println("All words count: " + fileAnalyzer.totalWordCount(filePath));
        }

    }

    private static void wordQuantityCommand() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();

        Map<String, Integer> wordMap = fileAnalyzer.wordMap(filePath);

        if (wordMap != null) {
            for (Map.Entry<String, Integer> wordEntry : wordMap.entrySet()) {
                System.out.println(wordEntry.getKey() + ": " + wordEntry.getValue());
            }
        }
    }
}
