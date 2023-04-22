package coordinate.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Rectangle extends AbstractFigure {

    public static final String OUTPUT_TRIANGLE_RESULT = "삼각형 넓이는 ";
    public Rectangle(List<Point> pointList) {
        super(pointList);
    }

    @Override
    public double pointResult() {
        Set<Integer> collectX = getUniqueCoordinateX(getPointList());
        Set<Integer> collectY = getUniqueCoordinateY(getPointList());

        return calculatePointLength(collectX) * calculatePointLength(collectY);
    }

    @Override
    public String getFigureResult() {
        return String.format(OUTPUT_TRIANGLE_RESULT + pointResult());
    }

    private double calculatePointLength(Set<Integer> collectCoordinates) {
        List<Integer> values = new ArrayList<>(collectCoordinates);
        return Math.abs(values.get(0) - values.get(1));
    }

    private Set<Integer> getUniqueCoordinateX(List<Point> pointList) {
        return getUniqueCoordinates(pointList, Point::getX);
    }

    private Set<Integer> getUniqueCoordinateY(List<Point> pointList) {
        return getUniqueCoordinates(pointList, Point::getY);
    }

    private Set<Integer> getUniqueCoordinates(List<Point> pointList, Function<Point, Integer> function) {
        return pointList.stream()
                .map(function)
                .collect(Collectors.toSet());
    }

}
