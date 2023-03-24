package blackjack.domain;

public class Player {
    String name;

    public Player(String name) {
        validateName(name);
        this.name = name;
    }

    public void validateName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("플레이어 이름이 공백입니다.");
        }
    }
}
