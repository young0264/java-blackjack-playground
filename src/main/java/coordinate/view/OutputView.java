package coordinate.view;

import coordinate.domain.Figure;

public class OutputView {

    public static final String VERTICAL_BAR = "|";
    public static final String FOUR_BLANK = "    ";
    public static final String FIGURE_POINT_MARK = ".";
    public static final String HORIZONTAL_BAL = "----";


    public static void printCoordinate(Figure figure) {
        printVertical(figure);
        printHorizontal();
        printHorizontalNumber();
    }



    public static void printHorizontal() {
        System.out.print(FOUR_BLANK);
        System.out.print("+");
        for (int i = 0; i < 24; i++) {
            System.out.print(HORIZONTAL_BAL);
        }
        enterLine();
    }

    public static void printVertical(Figure figure) {
        for (int i = 24; i > 0; i--) {
            printBarNumber(i);
            System.out.print(VERTICAL_BAR);

            printFigurePoints(figure,i);
            enterLine();
        }
    }

    private static void printFigurePoints(Figure figure, int y) {
        for (int x = 0; x <= 24; x++) {
            if (figure.hasPoint(x, y)) {
                System.out.print(FIGURE_POINT_MARK);
                continue;
            }
            System.out.print(FOUR_BLANK);
        }
    }

    private static void printHorizontalNumber() {
        for (int i = 0; i <= 24; i++) {
            printBarNumber(i);
        }
    }

    private static void enterLine() {
        System.out.println();
    }

    private static void printBarNumber(int i) {
        if (i % 2 == 0) {
            System.out.print(String.format("%4d", i));
            return;
        }System.out.print(FOUR_BLANK);
    }

}
