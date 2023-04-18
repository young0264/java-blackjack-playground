package fuel;

public class Avante extends Car{

    int distance;

    public Avante(int distance) {
        this.distance = distance;
    }

    @Override
    double getDistancePerLiter() {
        return 15;
    }

    @Override
    double getTripDistance() {
        return this.distance;
    }

    @Override
    String getName() {
        return "Avante";
    }

    @Override
    double getChargeQuantity() {
        return super.getChargeQuantity();
    }
}
