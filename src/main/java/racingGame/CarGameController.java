package racingGame;

import racingGame.domain.Car;
import racingGame.domain.CarDist;
import racingGame.domain.CarName;
import racingGame.domain.Cars;
import racingGame.view.InputView;
import racingGame.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class CarGameController {

    public static final int ZERO = 0;
    public static void run() {

        Cars cars = initCars(CarName.strSplitByComma(InputView.inputCarNames()));
        Integer attemptLimit = InputView.inputAttemptLimit();

        OutputView.printResults(attemptLimit, cars);
        OutputView.printWinners(cars);
    }

    private static Cars initCars(String[] carNamesArr) {
        List carList = new ArrayList();

        for (String strCarName : carNamesArr) {
            CarName carName = new CarName(strCarName);
            carList.add(new Car(carName, new CarDist(ZERO)));
        }
        return new Cars(carList);
    }

}


