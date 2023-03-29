package blackjack.domain;

import java.util.List;

public abstract class Participant {

    private Name name;
    private int betMoney;
    private Cards cards;



    public Cards addCard(Card card) {
        cards.addCard(card);
        return this.cards;
    }



}
