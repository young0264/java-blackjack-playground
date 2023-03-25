package blackjack.domain;

import java.util.List;

public class Cards {
    List<Card> cards;

    public Cards(List<Card> cards) {
        this.cards = cards;
    }

    public List<Card> addCard(Card card) {
        cards.add(card);
        return cards;
    }

}
