package blackjack.domain.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardDeck {


    private final List<Card> cardDeck = new ArrayList<>();

    public CardDeck(final List<Card> cardDeck) {
        this.cardDeck.addAll(cardDeck);
        shuffle();
    }

    private void shuffle() {
        Collections.shuffle(cardDeck);
    }

    public Card drawCard() {
        return this.cardDeck.remove(0);
    }
}
