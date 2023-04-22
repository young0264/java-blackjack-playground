package coordinate.domain;

import java.util.List;

import static java.lang.Math.pow;

public class Triangle extends AbstractFigure {

    public static final String OUTPUT_TRIANGLE_RESULT = "삼각형 넓이는 ";

    public Triangle(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double pointResult() {
        Point pointFist = getPointList().get(0);
        Point pointSecond = getPointList().get(1);
        Point pointThird = getPointList().get(2);

        double lengthEachPoint1 = pointFist.getLengthEachPoint(pointSecond);
        double lengthEachPoint2 = pointSecond.getLengthEachPoint(pointThird);
        double lengthEachPoint3 = pointThird.getLengthEachPoint(pointFist);

        return calculateHeronFomula(lengthEachPoint1, lengthEachPoint2, lengthEachPoint3);
    }

    @Override
    public String getFigureResult() {
        return OUTPUT_TRIANGLE_RESULT + pointResult();
    }

    private double calculateHeronFomula(double length1, double length2, double length3) {
        return Math.sqrt(pow(pow(length1, 2) + pow(length2, 2) + pow(length3, 2), 2) - 2 * (pow(length1, 4) + pow(length2, 4) + pow(length3, 4)))/4;

    }
}
