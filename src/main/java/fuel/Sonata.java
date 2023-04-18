package fuel;

public class Sonata extends Car {
    int distance;

    public Sonata(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 10;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return "Sonata";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
