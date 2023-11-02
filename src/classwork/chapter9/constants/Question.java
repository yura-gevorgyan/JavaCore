package classwork.chapter9.constants;

import java.util.Random;

public class Question implements SharedConstants {
    Random random = new Random();

    int ask() {
        int prop = (int) (100 * random.nextDouble());
        if (prop < 30) {
            return NO;
        } else if (prop < 60) {
            return YES;
        } else if (prop < 75) {
            return LATER;
        } else if (prop < 98) {
            return SOON;
        }else {
            return NEVER;
        }
    }
}
