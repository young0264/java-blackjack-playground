package blackjack.domain.factory;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;
import blackjack.domain.card.Denomination;
import blackjack.domain.card.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardFactory {

    private CardFactory() {

    }

    public static Cards create() {
        Cards cards = new Cards();

        for (Denomination denomination : Denomination.values()) {
            createBySymbol(cards, denomination);
        }
        return cards;
    }

    private static void createBySymbol(Cards cards, Denomination denomination) {
        for (Suit suit : Suit.values()) {
            Card card = new Card(denomination, suit);
            cards.addCard(card);
        }
    }


}
