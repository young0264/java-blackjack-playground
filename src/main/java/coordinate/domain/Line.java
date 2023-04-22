package coordinate.domain;

import java.util.List;

public class Line extends AbstractFigure{

    public static final String OUTPUT_LINE_RESULT = "두 점 사이의 거리는 ";
    public Line(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double pointResult() {
        Point pointFist = getPointList().get(0);
        Point pointSecond = getPointList().get(1);
        return pointFist.getLengthEachPoint(pointSecond);
    }

    @Override
    public String getFigureResult() {
        return String.format(OUTPUT_LINE_RESULT + pointResult());
    }
}
