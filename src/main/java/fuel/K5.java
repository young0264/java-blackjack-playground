package fuel;

public class K5 implements Car {

    int distance;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 13;
    }

    @Override
    public double getTripDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return "K5";
    }

    @Override
    public double getChargeQuantity() {
        return Car.super.getChargeQuantity();
    }
}
