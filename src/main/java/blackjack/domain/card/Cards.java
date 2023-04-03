package blackjack.domain.card;

import java.util.ArrayList;
import java.util.List;

public class Cards {
    List<Card> cards;
    private int cardPoint;

    public Cards() {
        this.cards = new ArrayList<>();
    }

    public List<Card> addCard(Card card) {
        cards.add(card);
        return this.cards;
    }

    public List<Card> getCards() {
        return cards;
    }

    public int getCardPoint() {
        initCardPoint();
        return this.cardPoint;
    }

    public void initCardPoint() {
        int newPoint = 0;
        for (Card card : cards) {
            newPoint += card.getDenomination().getScore();
        }
        this.cardPoint = newPoint;
    }

    public boolean isBust() {
        initCardPoint();
        return this.cardPoint > 21;
    }

    public boolean isNotBust() {
        initCardPoint();
        return this.cardPoint <= 21;
    }

    public boolean isBlakjack() {
        initCardPoint();
        return this.cardPoint == 21;
    }

}
