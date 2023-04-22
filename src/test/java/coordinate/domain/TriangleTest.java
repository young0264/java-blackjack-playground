package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    List<Point> pointList = new ArrayList<>();

    @BeforeEach
    void 삼각형_points_초기화() {
        pointList.add(new Point(1, 1));
        pointList.add(new Point(5, 1));
        pointList.add(new Point(3, 5));
    }

    @Test
    void 좌표로_삼각형_넓이구하기() {
        Triangle triangle = new Triangle(pointList);
        Assertions.assertThat(triangle.pointResult()).isEqualTo(8);
    }

    @Test
    void Figure_Result() {
        assertThat(new Triangle(pointList).getFigureResult()).isEqualTo("삼각형 넓이는 " + 8.0);
    }

}