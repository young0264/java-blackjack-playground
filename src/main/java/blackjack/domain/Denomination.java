package blackjack.domain;

import java.util.Arrays;

public enum Denomination {
    ACE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10);

    private final int score;

    Denomination(int score) {
        this.score = score;
    }

    public boolean isAce() {
        return this == ACE;
    }

    public int getScore() {
        return score;
    }

    public static Denomination of(int point) {
        return Arrays.stream(values())
                .filter(denomination -> denomination.score == point)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 범위의 숫자입니다."));
    }


}
