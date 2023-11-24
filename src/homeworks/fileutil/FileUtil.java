package homeworks.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil implements Command {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        boolean isRun = true;
        while (isRun) {
            Command.printCommands();
            String commands = SCANNER.nextLine();
            switch (commands) {
                case FILE_SEARCH:
                    fileSearchCommand();
                    break;
                case CONTENT_SEARCH:
                    contentSearchCommands();
                    break;
                case FIND_LINES:
                    findLinesCommand();
                    break;
                case PRINT_SIZE_OF_PACKAGE:
                    printSizeOfPackageCommand();
                    break;
                case CREATE_FILE_WITH_CONTENT:
                    createFileWithContent();
                    break;
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearchCommand() {
        System.out.println("Please input FILE PATH");
        String path = SCANNER.nextLine();

        System.out.println("Please input FILE NAME");
        String fileName = SCANNER.nextLine();

        fileSearch(path, fileName);
    }

    static void fileSearch(String path, String fileName) {

        File file = new File(path);
        if (file.isDirectory()) {

            File[] files = file.listFiles();
            if (files != null) {
                for (File listFile : files) {
                    if (listFile.isFile() && listFile.getName().equals(fileName)) {
                        System.out.println(true);
                        return;
                    } else if (listFile.isDirectory()) {
                        fileSearch(listFile.getAbsolutePath(), fileName);
                    }
                }
            }

        }

//        System.out.println("Please input FILE PATH");
//        String path = SCANNER.nextLine();
//
//        System.out.println("Please input FILE NAME");
//        String fileName = SCANNER.nextLine();

//        File file = new File(path, fileName);
//        System.out.println(file.exists());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։

    static void contentSearchCommands() {

        System.out.println("Please input FILE PATH");
        String path = SCANNER.nextLine();

        System.out.println("Please input KEYWORD");
        String keyword = SCANNER.nextLine();

        contentSearch(path, keyword);
    }

    static void contentSearch(String path, String keyword) {

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                for (File file1 : files) {

                    if (file1.isFile() && file1.getName().endsWith(".txt")) {

                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {

                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                if (line.contains(keyword)) {
                                    System.out.println(file1);
                                    break;
                                }
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    } else if (file1.isDirectory()) {
                        contentSearch(file1.getAbsolutePath(), keyword);
                    }
                }
            }
        }


    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLinesCommand() {
        System.out.println("Please input FILE PATH");
        String path = SCANNER.nextLine();

        System.out.println("Please input KEYWORD");
        String keyword = SCANNER.nextLine();

        findLines(path, keyword);
    }

    static void findLines(String path, String keyword) {

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                for (File file1 : files) {

                    if (file1.isFile() && file1.getName().endsWith(".txt")) {

                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                int num = 0;
                                num++;
                                if (line.contains(keyword)) {
                                    System.out.println(num + " " + line);
                                }
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else if (file1.isDirectory()) {
                        findLines(file1.getAbsolutePath(), keyword);
                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում

    static void printSizeOfPackageCommand() {
        System.out.println("Please input FILE PATH");
        String path = SCANNER.nextLine();

        printSizeOfPackage(path);
    }

    static void printSizeOfPackage(String path) {

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                double size = 0;

                for (File file1 : files) {
                    if (file1.isFile()) {
                        size += file1.length();
                    } else if (file1.isDirectory()) {
                        printSizeOfPackage(file1.getAbsolutePath());
                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent() {

        System.out.println("Please input FILE PATH");
        String filePath = SCANNER.nextLine();

        System.out.println("Please input FILE NAME");
        String fileName = SCANNER.nextLine();

        System.out.println("Please input FILE CONTENT");
        String content = SCANNER.nextLine();

        File file = new File(filePath);

        if (file.isDirectory()) {

            File file1 = new File(filePath, fileName);
            try {
                boolean newFile = file1.createNewFile();
                if (newFile) {
                    try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1))) {
                        bufferedWriter.write(content);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
