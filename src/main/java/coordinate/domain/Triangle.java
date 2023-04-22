package coordinate.domain;

import java.util.List;

import static java.lang.Math.pow;

public class Triangle extends AbstractFigure {

    public static final String OUTPUT_RECTANGLE_RESULT = "사각형 넓이는 ";

    public Triangle(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double pointResult() {
        double lengthEachPoint1 = pointList.get(0).getLengthEachPoint(pointList.get(1));
        double lengthEachPoint2 = pointList.get(1).getLengthEachPoint(pointList.get(2));
        double lengthEachPoint3 = pointList.get(2).getLengthEachPoint(pointList.get(0));

        return calculateHeronFomula(lengthEachPoint1, lengthEachPoint2, lengthEachPoint3);
    }

    @Override
    public String getFigureResult() {
        return OUTPUT_RECTANGLE_RESULT + pointResult();
    }

    private double calculateHeronFomula(double length1, double length2, double length3) {

        return Math.sqrt(pow(pow(length1, 2) + pow(length2, 2) + pow(length3, 2), 2) - 2 * (pow(length1, 4) + pow(length2, 4) + pow(length3, 4)))/4;

    }
}
