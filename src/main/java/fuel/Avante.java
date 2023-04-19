package fuel;

public class Avante implements Car {

    int distance;

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 15;
    }

    @Override
    public double getTripDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return "Avante";
    }

    public double getChargeQuantity() {
        return Car.super.getChargeQuantity();
    }
}
