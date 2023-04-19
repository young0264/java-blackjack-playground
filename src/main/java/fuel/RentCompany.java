package fuel;

import java.util.ArrayList;
import java.util.List;

public class RentCompany{
    private static final String NEWLINE = System.getProperty("line.separator");

    List<Car> carList;

    public RentCompany() {
        this.carList = new ArrayList<>();
    }

    public static RentCompany create() {
        return new RentCompany();
    }

    public String generateReport() {
        String answer = "";
        for (Car car : carList) {
            answer += String.format(car.getName() + " : " + (int)car.getChargeQuantity()+ "리터") + NEWLINE ;
        }
        return answer;
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }
}
