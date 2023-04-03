package blackjack.domain;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;
import blackjack.domain.card.Denomination;
import blackjack.domain.card.Suit;
import blackjack.domain.participant.Player;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @Test
    void create() {
        assertThat(new Player("새플레이어")).isInstanceOf(Player.class);
    }


    @Test
    void 카드_add() {
        Card card1 = new Card(Denomination.ACE, Suit.DIAMONDS);
        Card card2 = new Card(Denomination.JACK, Suit.HEARTS);
        Cards cards = new Cards();
        cards.addCard(card1);
        cards.addCard(card2);
    }

}
