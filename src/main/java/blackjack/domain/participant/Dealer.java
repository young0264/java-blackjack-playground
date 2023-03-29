package blackjack.domain;

public class Dealer {

    Name name;
    int betMoney;
    Cards cards;

    public Dealer(String name) {
        this.name = new Name(name);
    }

    public int saveMoney(int betMoney) {
        return this.betMoney = betMoney;
    }

}
