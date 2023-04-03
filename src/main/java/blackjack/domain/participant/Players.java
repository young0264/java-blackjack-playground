package blackjack.domain.participant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Players implements Iterable<Player> {
    private final List<Player> players;

    public Players(List<Player> players) {
        this.players = players;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public List<Participant> findWinner(Dealer dealer) {
        int minNum = dealer.gapBetween21();
        List<Participant> winners = new ArrayList<>();

        if (dealer.isNotBust()) {
            winners.add(dealer);
        }

        for (Player player : players) {
            if (player.gapBetween21() == minNum && player.isNotBust()) {
                winners.add(player);
            } else if (player.gapBetween21() < minNum && player.isNotBust()) {
                winners = new ArrayList<>();
                minNum = player.gapBetween21();
                winners.add(player);
            }
        }

        setFlagToWinners(winners);

        for (Participant winner : winners) {
            System.out.println("승자 : " + winner.getName());
        }
        return winners;
    }

    private static void setFlagToWinners(List<Participant> winners) {
        for (Participant winner : winners) {
            winner.setWinner();
        }
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
