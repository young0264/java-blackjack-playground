package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.card.Cards;

import java.util.List;

public class Dealer extends Participant{

//    Name name;
//    int betMoney;

    public Dealer() {
        super("딜러");
    }

//    public String getName() {
//        return name.getName();
//    }


//    public int saveMoney(int betMoney) {
//        return this.betMoney = betMoney;
//    }

    public boolean isUnder16() {
        System.out.println("get c p " + getCardPoint());
        return getCardPoint() <= 16;
    }

    public boolean isOver17() {
        return getCardPoint() >= 17;
    }

    public boolean isOver21() {
        int cardPoint = getCardPoint();
        return cardPoint >= 21;
    }

}
