package coordinate.domain;

import org.assertj.core.api.AssertionInfo;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class AbstractFigureTest {

    List<Point> pointList = new ArrayList<>();

    @BeforeEach
    void 좌표_포인트_초기화() {
        pointList.add(new Point(3, 3));
        pointList.add(new Point(3, 6));
        pointList.add(new Point(6, 3));
        pointList.add(new Point(6, 6));
    }
    @Test
    void 좌표_포인트를_가지고있는지() {
        Figure figure = FigureFactory.create(pointList);
        assertThat(figure.hasPoint(3, 6)).isTrue();
        assertThat(figure.hasPoint(3, 9)).isFalse();
    }

}