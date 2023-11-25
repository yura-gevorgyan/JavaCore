package homeworks.fileanalyzer;

public class StringUtil {

    static String stringWithoutChar(String s){
        s = s.replaceAll(",", "");
        s = s.replaceAll("!", "");
        s = s.replaceAll(":", "");
        s = s.replaceAll("\\.", "");
        return s;
    }
}
