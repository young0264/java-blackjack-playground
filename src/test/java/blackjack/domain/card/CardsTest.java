package blackjack.domain.card;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CardsTest {
    Card card1 = new Card(Denomination.ACE, Suit.DIAMONDS);
    Card card2 = new Card(Denomination.JACK, Suit.HEARTS);
    Cards cards = new Cards();
    @Test
    void cards_create() {
        cards.addCard(card1);
        cards.addCard(card2);
        assertThat(new Cards()).isInstanceOf(Cards.class);
    }


    @Test
    void add_card() {
        Card card3 = new Card(Denomination.FIVE, Suit.DIAMONDS);
        cards.addCard(card1);
        cards.addCard(card2);
        assertThat(cards.addCard(card3).size()).isEqualTo(3);
    }

}