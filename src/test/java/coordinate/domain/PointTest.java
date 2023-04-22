package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void 좌표는_24를_넘기면_안된다() {
        Assertions.assertThatThrownBy(() -> new Point(25, 21))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("X, Y 좌표 모두 24를 넘을 수 없습니다.");
    }

    @Test
    void 두좌표의_길이() {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(1, 4);
        assertThat(point1.getLengthEachPoint(point2)).isEqualTo(2);
    }

}