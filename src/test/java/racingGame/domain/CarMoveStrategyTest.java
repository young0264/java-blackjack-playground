package racingGame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class CarMoveStrategyTest {

    public static final int MIN_RANDOM_NUM = 4;

    @Test
    public void 랜덤값이_범위안일때() {
        Assertions.assertThat(new MoveStrategy() {
            @Override
            public boolean isMovable() {
                return true;
            }
        }.isMovable()).isTrue();
    }
}