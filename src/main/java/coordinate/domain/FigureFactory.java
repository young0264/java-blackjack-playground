package coordinate.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    public final static String INVALID_NUM_OF_POINT_ERROR = "유효하지 않은 Point 갯수 입니다.";

    private static final int NUMBER_OF_LINE = 2;
    private static final int NUMBER_OF_TRIANGLE = 3;
    private static final int NUMBER_OF_RECTANGLE = 4;



    private static final Map<Integer, Function<List<Point>,Figure>> figureClassify = new HashMap<>();

    static {
        figureClassify.put(NUMBER_OF_LINE, Line::new);
        figureClassify.put(NUMBER_OF_TRIANGLE, Triangle::new);
        figureClassify.put(NUMBER_OF_RECTANGLE, Rectangle::new);
    }

    public static Figure create(List<Point> pointList) {
        if (pointList == null || pointList.isEmpty()) {
            throw new IllegalArgumentException(AbstractFigure.FIGURE_NULL_ERROR);
        }
        if (isInvalidNumOf(pointList)) {
            throw new IllegalArgumentException(INVALID_NUM_OF_POINT_ERROR);
        }
        return classifyFigure(pointList);
    }

    private static Figure classifyFigure(List<Point> pointList) {
        return figureClassify.get(pointList.size()).apply(pointList);
    }

    private static boolean isInvalidNumOf(List<Point> pointList) {
        return pointList.size() < NUMBER_OF_LINE || pointList.size() > NUMBER_OF_RECTANGLE;
    }
}
