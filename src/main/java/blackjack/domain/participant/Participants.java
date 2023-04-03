package blackjack.domain.participant;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Participants {
    List<Participant> participants;

    public Participants(List<Participant> participantList) {
        this.participants = participantList;
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
