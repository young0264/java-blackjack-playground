package racingGame.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {
    public static final String Comma = ", ";
    private List<Car> carList;

    public Stream<Car> stream() {
        return carList.stream();
    }

    public Cars(List<Car> carList) {
        this.carList = carList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public String getWinners() {
        List<String> winnerList = new ArrayList<>();
        int nowDist = 0;

        for (Car car : carList) {
            if (car.getCarDist() > nowDist) {
                winnerList = new ArrayList<>();
                winnerList.add(car.getCarName());
                nowDist = car.getCarDist();
            } else if (nowDist == car.getCarDist()) {
                winnerList.add(car.getCarName());
            } else if (car.getCarDist() < nowDist) {
                continue;
            }
        }

        return getWinnerStrByList(winnerList);
    }


    public static int getMaxDist(Cars cars) {
        return cars.stream()
                .map(car -> car.getCarDist())
                .reduce(0, Integer::max);
    }


    public static String getWinnerStrByList(List<String> winnerCarNames) {
        return winnerCarNames.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(Comma));
    }
}
