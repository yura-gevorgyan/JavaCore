package homeworks;

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

    void secondFigure(int a, char c) {
        for (int i = a; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(c + " ");
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

}
