package blackjack.domain;

public class Player {
    Name name;
    int money;

    public Player(String name) {
        this.name = new Name(name);
    }


    public int saveMoney(int money) {
        return this.money = money;
    }

}
