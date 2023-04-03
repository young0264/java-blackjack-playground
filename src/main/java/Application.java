import blackjack.domain.card.CardDeck;
import blackjack.domain.factory.CardFactory;
import blackjack.domain.participant.Dealer;
import blackjack.domain.participant.Players;
import blackjack.view.InputView;
import blackjack.view.OutputView;

public class Application {

    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck(CardFactory.create());

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        Dealer dealer = new Dealer();

        Players players = inputView.readNames();

        inputView.askPlayersMoney(players);
        outputView.shareCard(cardDeck, dealer, players);
        inputView.askPlayersCardMore(cardDeck, players);
        outputView.printResult(dealer, players);
        outputView.printPlayersRevenue(dealer, players);

    }

}
