package racingGame.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    ArrayList<Car> carsList = new ArrayList<>();

    @BeforeEach
    public void carInit() {
        Car po = new Car(new CarName("포르쉐"), new CarDist(3));
        Car fe = new Car(new CarName("페라리"), new CarDist(6));
        Car ze = new Car(new CarName("지프"), new CarDist(6));
        carsList.add(po);
        carsList.add(fe);
        carsList.add(ze);
    }

    @Test
    void List_winner를_str타입으로_변환() {
        Cars cars = new Cars(carsList);
        String winners = cars.getWinners();
        assertThat(winners).isEqualTo("페라리, 지프");
    }

    @Test
    void 게임종료후_가장많이_이동한_거리구하기() {
        Cars cars = new Cars(carsList);
        assertThat(Cars.getMaxDist(cars)).isEqualTo(6);
    }

}
