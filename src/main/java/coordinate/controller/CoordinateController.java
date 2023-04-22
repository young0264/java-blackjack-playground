package coordinate.controller;

import coordinate.domain.Figure;
import coordinate.view.InputView;
import coordinate.view.OutputView;

public class CoordinateController {

    public static void run() {
        Figure figure = InputView.inputCoordinates();
        OutputView.printCoordinate(figure);
        OutputView.printFigureResult(figure);
    }
}
