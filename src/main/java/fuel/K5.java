package fuel;

public class K5 extends Car{

    int distance;

    public K5(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 13;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return "K5";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
