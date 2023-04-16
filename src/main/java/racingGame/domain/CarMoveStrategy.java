package racingGame.domain;

import java.util.Random;

public class CarMoveStrategy implements MoveStrategy {

    public static final int MAX_RANDOM_NUM = 10;
    public static final int MIN_RANDOM_NUM = 4;

    @Override
    public boolean isMovable() {
        return new Random().nextInt(MAX_RANDOM_NUM) >= MIN_RANDOM_NUM;
    }
}
