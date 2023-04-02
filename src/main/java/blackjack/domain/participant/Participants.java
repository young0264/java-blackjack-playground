package blackjack.domain.participant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {
    List<Participant> participants;

    public Participants(Dealer dealer, Players players) {
        this.participants.add(dealer);
        this.participants.addAll(players.getPlayers());
    }

    public List<Participant> findWinner() {
        int minNum = getMinNum();
        return participants.stream()
                .filter(x -> x.getCardPoint() == minNum)
                .collect(Collectors.toList());
    }

    public int getMinNum() {
        return this.participants
                .stream()
                .mapToInt(x -> x.getCardPoint())
                .min()
                .orElseThrow(IllegalArgumentException::new);
    }

}
