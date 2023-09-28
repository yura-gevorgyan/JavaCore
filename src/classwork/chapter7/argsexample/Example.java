package classwork.chapter7.argsexample;

public class Example {

    public static void main(String[] args) {
        if (args.length > 0){
            String lang = args[0];
            switch (lang){
                case "HY":
                    System.out.println("Բարև");
                    break;
                case "RU":
                    System.out.println("привет");
                    break;
                case "ENG":
                    System.out.println("Hello");
                    break;
                default:
                    System.out.println("Please write your language");
            }
        }
    }
}
