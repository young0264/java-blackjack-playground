package racingGame.view;

import racingGame.domain.Car;
import racingGame.domain.CarMoveStrategy;
import racingGame.domain.Cars;

public class OutputView {

    public static void printResults(int attemptLimit, Cars cars) {
        System.out.println("실행결과");
        for (int i = 0; i < attemptLimit; i++) {
            printOneResult(cars);
            System.out.println();
        }
    }

    private static void printOneResult(Cars cars) {
        for (Car car : cars.getCarList()) {
            car.move(new CarMoveStrategy());
            System.out.println(String.format("%s : %s", car.getCarName(), "-".repeat(car.getCarDist())));
        }
    }

    public static void printWinners(Cars cars) {
        String winners = cars.getWinners();
        System.out.println(String.format("%s가 최종 우승했습니다.", winners));
    }
}
