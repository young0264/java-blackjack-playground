package blackjack.domain.card;

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
    JACK(10, "J"),
    QUEEN(10, "Q"),
    KING(10, "K");

    private final int score;
    private final String symbol;

    Denomination(int score) {
        this.score = score;
        this.symbol = String.valueOf(score);
    }

    Denomination(int score, String symbol) {
        this.score = score;
        this.symbol = symbol;
    }

    public boolean isAce() {
        return this == ACE;
    }

    public int getScore() {
        return score;
    }

    public String getSymbol() {
        return symbol;
    }

    public static Denomination of(int point) {
        return Arrays.stream(values())
                .filter(denomination -> denomination.score == point)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 범위의 숫자입니다."));
    }


}
