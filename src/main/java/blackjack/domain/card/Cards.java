package blackjack.domain;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    List<Card> cards;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public List<Card> addCard(Card card) {
        cards.add(card);
        return this.cards;
    }

}
