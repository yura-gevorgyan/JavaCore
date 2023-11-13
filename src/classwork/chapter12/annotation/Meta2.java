package classwork.chapter12.annotation;


import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

@MyAnno(str = "Meta2", val = 99)
@What(description = "Annotation")
public class Meta2 {
    @MyAnno(str = "Testing", val = 100)
    @What(description = "Method Annotation")
    public static void myMeth() {
        Meta2 ob = new Meta2();

        try {
            Annotation[] annos = ob.getClass().getAnnotations();

            System.out.println("All annotation in class Meta2");

            for (Annotation anno : annos) {
                System.out.println(anno);
            }

            System.out.println();

            Method m = ob.getClass().getMethod("myMeth");

            annos = m.getAnnotations();

            System.out.println("All Annotation in method myMeth()");

            for (Annotation anno : annos) {
                System.out.println(anno);
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
