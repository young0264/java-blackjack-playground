package nextstep.fp;

import java.util.Objects;

public class Car {
    private final String name;
    private final int position;
    public static final int INCREASE_DIST = 1;

    public Car(String name, int position) {
        this.name = name;
        this.position = position;
    }

    public Car move(MoveStrategy moveStrategy) {
        if (moveStrategy.isMovable()) {
            return new Car(name, position + INCREASE_DIST);
        }
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()){ return false;}

        Car car = (Car) o;
        return position == car.position &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, position);
    }
}
