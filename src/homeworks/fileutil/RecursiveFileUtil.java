package homeworks.fileutil;

import java.io.File;
import java.util.Scanner;

public class RecursiveFileUtil {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//      System.out.println(fileSearch("C:\\Program Files\\Git", "git-receive-pack.exe"));
        //"C:\Program Files\Gitusr\ssl\openssl.cnf"

        // fileSearch();
        printSizeOfPackage();

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
            recursiveFileSearch(file, fileName);
        }
    }

    private static void recursiveFileSearch(File file, String fileName) {

        File[] files = file.listFiles();

        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    recursiveFileSearch(file1, fileName);
                } else if (file1.getName().equals(fileName)) {
                    System.out.println(true);
                }
            }
        }
    }

    static void printSizeOfPackage() {

        System.out.println("Please input FILE PATH");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (file.isFile()) {
            System.out.println("You input FILE PATH");
        } else {
            System.out.println(recursivePrintSizeOfPackage(file));
        }
    }

    static double recursivePrintSizeOfPackage(File file) {

        File[] files = file.listFiles();
        double size = 0;

        if (files != null) {
            for (File file1 : files) {
                if (file1.isDirectory()) {
                    recursivePrintSizeOfPackage(file1);
                }
                size += file1.length();
            }
        }
        return size;
    }

}

