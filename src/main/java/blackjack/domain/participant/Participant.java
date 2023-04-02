package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;

import java.util.List;

public abstract class Participant {

    private Name name;
    private int betMoney;
    private Cards cards;
    private int cardPoint;

    protected Participant(String name) {
        this.name = new Name(name);
        this.cards = new Cards();
    }

    public Participant(Name name, Cards cards) {
        this.name = name;
        this.cards = cards;
    }

    public void addCard(Card card) {
        cards.addCard(card);
    }

    public Cards getCards() {
        return this.cards;
    }

    public String getName() {
        return name.getName();
    }
    public int saveMoney(int betMoney) {
        return this.betMoney = betMoney;
    }
    public int getCardPoint() {
        List<Card> cards = this.cards.getCards();
        int cardPoint = 0;
        for (Card card : cards) {
            cardPoint += card.getDenomination().getScore();
        }
        return this.cardPoint = cardPoint;
    }
//
//    public int getScore() {
//        return cards.ge();
//    }
//
//    public int getCardSize() {
//        return cards.getCards().size();
//    }
//
//    public List<Card> getCards() {
//        return cards.getValue();
//    }
//
//    public boolean isBust() {
//        return cards.isBust();
//    }

//    public boolean isNotBust() {
//        return !isBust();
//    }

    public abstract boolean isWin(final Player player);

}
