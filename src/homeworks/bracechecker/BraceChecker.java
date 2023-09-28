package homeworks.bracechecker;

public class BraceChecker {
    private String text;


    BraceChecker(String text) {
        this.text = text;
    }


    void check() {
        Stack stack = new Stack();
        Stack stack1 = new Stack();
        char temp;
        char temp1;
        System.out.println(text);


        for (int j = (text.length() - 1); j >= 0; j--) {
            char c1 = text.charAt(j);
            switch (c1) {
                case ')', '}', ']':
                    stack1.push(c1);
                    break;
                case '(', '[', '{':
                    temp1 = (char) stack1.pop();
                    switch (temp1) {
                        case 0:
                            System.out.println("Error opened but not closed at: " + j);
                            break;
                    }
                    break;

            }
        }

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '(', '{', '[':
                    stack.push(c);
                    break;
                case ')':
                    temp = (char) stack.pop();
                    switch (temp) {
                        case '[':
                            System.out.println("Error opened " + temp + " but closed ) at: " + i);
                            break;
                        case '{':
                            System.out.println("Error opened " + temp + " but closed ) at: " + i);
                            break;
                        case 0:
                            System.out.println("Error closed but not opened at: " + i);
                    }
                    break;
                case '}':
                    temp = (char) stack.pop();
                    switch (temp) {
                        case '[':
                            System.out.println("Error opened " + temp + " but closed } at: " + i);
                            break;
                        case '(':
                            System.out.println("Error opened " + temp + " but closed } at: " + i);
                            break;
                        case 0:
                            System.out.println("Error closed but not opened at: " + i);
                    }
                    break;
                case ']':
                    temp = (char) stack.pop();
                    switch (temp) {
                        case '{':
                            System.out.println("Error opened " + temp + " but closed ] at: " + i);
                            break;
                        case '(':
                            System.out.println("Error opened " + temp + " but closed ] at: " + i);
                            break;
                        case 0:
                            System.out.println("Error closed but not opened at: " + i);
                    }
                    break;
            }


        }


    }
}
