package racingGame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;


class CarMoveStrategyTest implements MoveStrategy {
    public static final int MIN_RANDOM_NUM = 4;

    @Override
    public int createMovePoint() {
        return 5;
    }

    @Test
    public void 랜덤값이_범위안일때() {
        Assertions.assertThat(createMovePoint() >= MIN_RANDOM_NUM).isTrue();
    }


}