package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.view.InputView;

public class CoordinateController {

    public static void run() {
        Figure figure = InputView.inputCoordinates();
        System.out.println(figure.getFigureResult());
    }
}
