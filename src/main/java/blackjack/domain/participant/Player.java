package blackjack.domain;

public class Player {
    Name name;
    int betMoney;
    Cards cards;

    public Player(String name) {
        this.name = new Name(name);
    }


    public int saveMoney(int betMoney) {
        return this.betMoney = betMoney;
    }

    public void addCard(Card card) {
        cards.addCard(card);
    }

}
