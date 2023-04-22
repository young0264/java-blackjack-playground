package coordinate.domain;

import java.util.List;

public abstract class AbstractFigure implements Figure{

    public static final String FIGURE_NULL_ERROR = "Point 값이 비어있으면 안됩니다.";
    List<Point> pointList;

    public AbstractFigure(List<Point> pointList) {
        if (pointList == null || pointList.isEmpty()) {
            throw new IllegalArgumentException(FIGURE_NULL_ERROR);
        }
        this.pointList = pointList;
    }
}
