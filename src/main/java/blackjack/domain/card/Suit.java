package blackjack.domain.card;

import java.util.Arrays;

public enum Suit {
    DIAMONDS("다이아몬드"),
    HEARTS("하트"),
    SPADES("스페이드"),
    CLUBS("클로버");


    String suit;
    Suit(String suit) {
        this.suit = suit;
    }

    public String getName() {
        return this.suit;
    }

    public static Suit of(String name) {
        return Arrays.stream(values())
                .filter(suit -> suit.suit.equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 슈트입니다"));
    }

}
