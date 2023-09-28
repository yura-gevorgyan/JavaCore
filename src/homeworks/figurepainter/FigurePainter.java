package homeworks.figurepainter;

public class FigurePainter {


    void firstFigure(int a, char c) {
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    void firstFigure(int a) {
        for (int i = 1; i < a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    void firstFigure() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    void secondFigure(int a, char c) {
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }

            System.out.println();
        }

        System.out.println();
    }

    void secondFigure(int a) {
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }

    void secondFigure() {
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        System.out.println();
    }

    void thirdFigure(int a, char c) {
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    void thirdFigure(int a) {
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }

    void thirdFigure() {
        for (int i = 1; i < 5; i++) {
            for (int j = (5 - 1); j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
    }


    void fourFigure(int a, char c) {
        for (int i = 1; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print(c + " ");
            }
            System.out.println();

            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
        }

        System.out.println();
    }

    void fourFigure(int a) {
        for (int i = 1; i < a; i++) {
            for (int j = a; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();

            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
        }

        System.out.println();
    }

    void fourFigure() {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();

            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
        }

        System.out.println();
    }


    void fifthFigure(int a, char c) {
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print(" " + c);
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
        }
    }

    void fifthFigure(int a) {
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int j = (a - 1); j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
        }
    }
    void fifthFigure() {
        for (int i = 1; i < 5; i++) {
            for (int j = (5 - 1); j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = (5 - 1); j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
        }
    }

}
