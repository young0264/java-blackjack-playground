package coordinate.domain;

import java.util.List;

public class Line {

    List<Point> pointList;

    public Line(List<Point> pointList) {
        this.pointList = pointList;
    }

    public double pointResult() {
        return pointList.get(0).getLengthEachPoint(pointList.get(1));
    }
}
