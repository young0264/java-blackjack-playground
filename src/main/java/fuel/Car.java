package fuel;

public interface Car {
    /**
     * 연비
     */
    double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    double getTripDistance();

    /**
     * 차종 이름
     */
    String getName();

    /**
     * 주입해야할 연료량
     */
    default double getChargeQuantity(){
        return getTripDistance() / getDistancePerLiter();
    }
}
