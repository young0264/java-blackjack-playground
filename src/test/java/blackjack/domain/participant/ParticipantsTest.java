package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardDeck;
import blackjack.domain.card.Denomination;
import blackjack.domain.card.Suit;
import blackjack.domain.factory.CardFactory;
import blackjack.view.OutputView;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ParticipantsTest {

    @Test
    void 참가자들_카드값_최솟값검증() {
        Dealer dealer = new Dealer();
        Player player = new Player("testUser1");
        Player player1 = new Player("testUser2");

        ArrayList<Player> players = new ArrayList<>();
        players.add(player);
        players.add(player1);
        dealer.addCard(new Card(Denomination.TWO, Suit.DIAMONDS));
        player.addCard(new Card(Denomination.FIVE, Suit.DIAMONDS));
        player1.addCard(new Card(Denomination.JACK, Suit.DIAMONDS));

        Players players1 = new Players(players);
        List<Participant> participantList = OutputView.makeParticipantList(dealer, players1);
        Participants participants = new Participants(participantList);

        Assertions.assertThat(participants.getMinNum()).isEqualTo(2);
    }

}