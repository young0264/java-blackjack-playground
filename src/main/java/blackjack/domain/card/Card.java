package blackjack.domain.card;

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

    public String getCardInfo() {
        String res = denomination.getSymbol() + suit.getName();
        return res;
    }

}
