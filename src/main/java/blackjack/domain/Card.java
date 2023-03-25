package blackjack.domain;

public class Card {
    Denomination denomination;
    Suit suit;

    public Card(Denomination denomination, Suit suit) {

        this.denomination = denomination;
        this.suit = suit;
    }


    public Denomination getDenomination() {
        return denomination;
    }

    public Suit getSuit() {
        return suit;
    }
}
