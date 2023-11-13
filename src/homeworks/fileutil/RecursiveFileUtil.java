package homeworks.fileutil;

import java.io.File;
import java.util.Scanner;

public class RecursiveFileUtil {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//      System.out.println(fileSearch("C:\\Program Files\\Git", "git-receive-pack.exe"));

        fileSearch();

    }


    private static void fileSearch() {

        System.out.println("Please input FILE PATH");
        String filePath = scanner.nextLine();

        System.out.println("Please input FILE NAME");
        String fileName = scanner.nextLine();

        File file = new File(filePath);

        if (file.isFile()) {
            System.out.println("You input FILE PATH");
        } else {
            System.out.println(recursiveFileSearch(file, fileName));
        }
    }

    private static boolean recursiveFileSearch(File file, String filName) {
        boolean b = false;
        File[] files = file.listFiles();

        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    b = recursiveFileSearch(file1, filName);
                } else if (file1.getName().equals(filName)) {
                    b = true;
                    break;
                }
            }
        }
        return b;
    }

}

