package racingGame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarDistTest {

    @Test
    void isMovable일때_1증가() {
        CarDist carDist = new CarDist(3);
        carDist.stepForward();
        assertThat(carDist.getCarDist()).isEqualTo(4);
    }

}