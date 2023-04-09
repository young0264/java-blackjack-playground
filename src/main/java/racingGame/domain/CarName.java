package racingGame;

public class CarName{
    String carName;
    public static int NAME_MAX_SIZE = 5;
    public CarName(String name) {
        if (name.length() > NAME_MAX_SIZE) {
            throw new IllegalArgumentException("자동차 이름은 5자를 넘을 수 없습니다.");
        }
        this.carName = name;
    }

    public String getCarName() {
        return this.carName;
    }
}
