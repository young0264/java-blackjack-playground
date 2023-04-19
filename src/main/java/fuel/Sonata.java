package fuel;

public class Sonata implements Car {
    int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    public double getDistancePerLiter() {
        return 10;
    }

    @Override
    public double getTripDistance() {
        return this.distance;
    }

    @Override
    public String getName() {
        return "Sonata";
    }

    @Override
    public double getChargeQuantity() {
        return Car.super.getChargeQuantity();
    }
}
