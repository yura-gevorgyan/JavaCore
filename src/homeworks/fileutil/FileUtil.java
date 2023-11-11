package homeworks.fileutil;

import java.io.*;
import java.util.Scanner;

public class FileUtil {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static void fileSearch() {

        System.out.println("Please input FILE PATH");
        String path = scanner.nextLine();

        System.out.println("Please input FILE NAME");
        String fileName = scanner.nextLine();

        File file = new File(path);
        if (file.isDirectory()) {

            File[] files = file.listFiles();
            if (files != null){
                for (File listFile : file.listFiles()) {
                    if (listFile.getName().equals(fileName)) {
                        System.out.println(true);
                        return;
                    }
                }
                System.out.println(false);
            }

        }

//        System.out.println("Please input FILE PATH");
//        String path = scanner.nextLine();
//
//        System.out.println("Please input FILE NAME");
//        String fileName = scanner.nextLine();

//        File file = new File(path, fileName);
//        System.out.println(file.exists());

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch() {

        System.out.println("Please input FILE PATH");
        String path = scanner.nextLine();

        System.out.println("Please input KEYWORD");
        String keyword = scanner.nextLine();

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                for (File file1 : files) {

                    if (file1.getName().endsWith(".txt")) {

                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {

                            while (bufferedReader.readLine() != null) {
                                if (bufferedReader.readLine().contains(keyword)) {
                                    System.out.println(file1);
                                    break;
                                }
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines() {

        System.out.println("Please input FILE PATH");
        String path = scanner.nextLine();

        System.out.println("Please input KEYWORD");
        String keyword = scanner.nextLine();

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                for (File file1 : files) {

                    if (file1.getName().endsWith(".txt")) {

                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1))) {

                            while (bufferedReader.readLine() != null) {
                                int num = 0;
                                num++;
                                if (bufferedReader.readLine().contains(keyword)) {
                                    System.out.println(num + " " + bufferedReader.readLine());
                                }
                            }

                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                }
            }
        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage() {

        System.out.println("Please input FILE PATH");
        String path = scanner.nextLine();

        File file = new File(path);

        if (file.isDirectory()) {

            File[] files = file.listFiles();

            if (files != null) {
                int size = 0;

                for (File file1 : files) {
                    if (file1.isFile()) {
                        size += file1.length();
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
        String filePath = scanner.nextLine();

        System.out.println("Please input FILE NAME");
        String fileName = scanner.nextLine();

        System.out.println("Please input FILE CONTENT");
        String content = scanner.nextLine();

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
