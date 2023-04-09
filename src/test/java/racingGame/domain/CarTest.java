package racingGame.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingGame.domain.CarName;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

//* 기능 요구사항
//        - 자동차 이름은 쉼표(,)를 기준으로 구분한다. -> CarName
//        - 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
//
//        - 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
//        - 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우이다.
//        - 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.
public class CarTest {

    @Test
    void 자동차이름_5자이하_성공() {
        String name = "페라리";
        Assertions.assertThat(new CarName(name).getCarName()).isEqualTo(name);
    }

    @Test
    void 자동차이름_5자가_넘으면_예외처리() {
        String name = "페라리가너무길어";
        assertThatThrownBy(() ->new CarName(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("자동차 이름은 5자를 넘을 수 없습니다.");
    }

    @Test
    void 자동차_거리_가져오기() {
        Car car = new Car(new CarName("페라리"), new CarDist(7));
        assertThat(car.getCarDist()).isEqualTo(7);
    }

    @Test
    void 자동차_이름_가져오기() {
        Car car = new Car(new CarName("페라리"), new CarDist(7));
        assertThat(car.getCarName()).isEqualTo("페라리");
    }

    @Test
    void Car_move() {
//        Move 랜덤임
//        Car car = new Car(new CarName("페라리"), new CarDist(7));
//        car.move(new CarMoveStrategy());
//        assertThat(car.getCarDist()).isEqualTo(8);
    }



}
