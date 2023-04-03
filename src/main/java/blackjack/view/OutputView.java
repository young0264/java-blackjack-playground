package blackjack.view;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardDeck;
import blackjack.domain.card.Cards;
import blackjack.domain.participant.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OutputView {

    public void shareCard(CardDeck cardDeck, Dealer dealer, Players players) {
        List<String> names = players.getPlayers()
                .stream()
                .map(player -> player.getName())
                .collect(Collectors.toList());

        System.out.println(String.format("딜러와 %s에게 2장의 카드를 나누었습니다.", names));
        participantCardInit(cardDeck, dealer, players);
    }

    private void participantCardInit(CardDeck cardDeck, Dealer dealer, Players players) {
        printParticipantStatus(cardDeck, dealer);
        for (Player player : players) {
            printParticipantStatus(cardDeck, player);
        }
    }

    private void printParticipantStatus(CardDeck cardDeck, Participant participant) {
        participant.addCard(cardDeck.drawCard());
        participant.addCard(cardDeck.drawCard());
        if(participant instanceof Dealer && ((Dealer) participant).isUnder16()){
            System.out.println("딜러 에드");
            participant.addCard(cardDeck.drawCard());

        }
        System.out.println(makeParticipantStatus(participant));
    }

    public static String makeParticipantStatus(Participant participant) {
        if (participant instanceof Dealer) {
            return String.format("%s카드: %s", "딜러", makeCardsName(participant.getCards()));
        }
        else {
            return String.format("%s카드: %s", participant.getName(), makeCardsName(participant.getCards()));
        }
    }

    private static String makeCardsName(Cards cards) {
        return cards.getCards().stream()
                .map(Card::getCardInfo)
                .collect(Collectors.joining(","));
    }

    private static String makeGameResult(Participant participant) {
        return String.format(" - 결과 : %d", participant.getCardPoint());
    }

    public void printResult(Dealer dealer, Players players) {
        System.out.println(makeParticipantStatus(dealer) + makeGameResult(dealer));
        for (Player player : players) {
            System.out.println(makeParticipantStatus(player) + makeGameResult(player));
        }
    }


    public void printPlayersRevenue(Dealer dealer, Players players) {
        System.out.println("## 최종 수익");
        List<Player> playerList = players.getPlayers();
        List<Participant> participants = makeParticipantList(dealer, players);

        List<Participant> winner = new Participants(participants).findWinner();

        int revenue = 0;
        //winner가 아닌 유저의 돈 구하기
        int MoneySum = playerList.stream()
                .filter(player -> !player.getWinnerFlag())
                .mapToInt(x -> x.getBetMoney())
                .sum();

        if (winner.contains(dealer)) {
            revenue = (int) (MoneySum / winner.size());
        } else {
            revenue = (int) (MoneySum / (winner.size() + 1));
        }

        System.out.println(String.format("딜러: %d", revenue));

        for (Player player : playerList) {
            if (player.getWinnerFlag()) {
                System.out.println(String.format("%s: %d", player.getName(), revenue));
            } else {
                System.out.println(String.format("%s: %d", player.getName(), -player.getBetMoney()));
            }
        }
    }

    public static List<Participant> makeParticipantList(Dealer dealer, Players players) {
        List<Participant> participants = new ArrayList<>();
        participants.add(dealer);
        participants.addAll(players.getPlayers());
        return participants;
    }


}
