package blackjack.domain;

public class Name {

    private final String name;

    public Name(String name) {
        validate(name);
        this.name = name;
    }

    public void validate(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("플레이어 이름이 공백입니다.");
        }
    }
}
