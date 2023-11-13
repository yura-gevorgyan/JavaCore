package classwork.chapter12.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class RepeatAnno {
    @MyAnno(str = "First testing", val = -1)
    @MyAnno(str = "Second testing", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth", String.class, int.class);

            Annotation annotation = m.getAnnotation(MyRepeatedAnnos.class);

            System.out.println(annotation);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth("test", 10);
    }
}
