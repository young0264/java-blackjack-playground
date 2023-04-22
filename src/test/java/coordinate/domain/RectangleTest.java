package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void 사각형_넓이_구하기() {
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(3, 3));
        pointList.add(new Point(3, 6));
        pointList.add(new Point(6, 3));
        pointList.add(new Point(6, 6));

        Rectangle rectangle = new Rectangle(pointList);
        Assertions.assertThat(rectangle.pointResult()).isEqualTo(9);

    }

}