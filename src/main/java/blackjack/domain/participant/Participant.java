package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;

import java.util.List;

public abstract class Participant {

    private Name name;
    private int betMoney;
    private Cards cards;
    private boolean isWinner = false;
    private boolean isBust = false;

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

    public int getBetMoney() {
        return this.betMoney;
    }

    public int getCardPoint() {
        return cards.getCardPoint();
    }

    public boolean isBlakjack() {
        return cards.isBlakjack();
    }

    public boolean isBust() {
        return this.isBust = cards.isBust();
    }

    public boolean isNotBust() {
        return cards.isNotBust();
    }

    public int gapBetween21() {
        return Math.abs(21 - this.getCardPoint());
    }

    public void setWinner() {
        this.isWinner = true;
    }

    public boolean getWinnerFlag() {
        return this.isWinner;
    }


//    public abstract boolean isWin(final Player player);


}
