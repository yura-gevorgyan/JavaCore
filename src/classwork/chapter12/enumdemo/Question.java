package classwork.chapter12.enumdemo;

import java.util.Random;

public class Question {

    Random random = new Random();

    Answers ask() {
        int prop = (int) (100 * random.nextDouble());

        if (prop < 15) {
            return Answers.MAYBE;
        }
        if (prop < 30) {
            return Answers.NO;
        }
        if (prop < 60) {
            return Answers.YES;
        }
        if (prop < 75) {
            return Answers.LATER;
        }
        if (prop < 98) {
            return Answers.SOON;
        } else {
            return Answers.NEVER;
        }
    }
}
