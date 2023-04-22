package coordinate.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LineTest {
    List<Point> pointList = new ArrayList<>();

    @BeforeEach
    void Line_Points_초기화() {
        pointList.add(new Point(1, 4));
        pointList.add(new Point(4, 8));
    }
    @Test
    void Line_길이구하기() {
        Line line = new Line(pointList);
        assertThat(line.pointResult()).isEqualTo(5);
    }

    @Test
    void Figure_Result() {
        assertThat(new Line(pointList).getFigureResult()).isEqualTo("두 점 사이의 거리는 " + 5.0);
    }

}