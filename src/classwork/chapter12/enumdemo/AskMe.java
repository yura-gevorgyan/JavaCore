package classwork.chapter12.enumdemo;

public class AskMe {

    static void answer(Answers answers){
        switch (answers){
            case NO:
                System.out.println(Answers.NO);
                break;
            case YES:
                System.out.println(Answers.YES);
                break;
            case MAYBE:
                System.out.println(Answers.MAYBE);
                break;
            case LATER:
                System.out.println(Answers.LATER);
                break;
            case SOON:
                System.out.println(Answers.SOON);
                break;
            case NEVER:
                System.out.println(Answers.NEVER);
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());

    }
}
