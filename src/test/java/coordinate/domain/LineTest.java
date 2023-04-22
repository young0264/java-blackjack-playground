package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {

    @Test
    void Line_길이구하기() {
        List<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1, 4));
        pointList.add(new Point(4, 8));
        Line line = new Line(pointList);
        Assertions.assertThat(line.pointResult()).isEqualTo(5);


    }

}