package racingGame.domain;

public class CarDist {
    int carDist = 0;

    private static final int INCREASE_DIST = 1;

    public CarDist(int carDist) {
        this.carDist = carDist;
    }

    public void stepForward() {
        this.carDist += INCREASE_DIST;
    }

    public int getCarDist() {
        return this.carDist;
    }
}
