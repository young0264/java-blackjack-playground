package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void 좌표로_삼각형_넓이구하기() {
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1, 1));
        pointList.add(new Point(5, 1));
        pointList.add(new Point(3, 5));

        Triangle triangle = new Triangle(pointList);
        Assertions.assertThat(triangle.pointResult()).isEqualTo(8);
    }

}