package fuel;

public abstract class Car {
    /**
     * 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();

    /**
     * 차종 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량
     */
    double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }
}
