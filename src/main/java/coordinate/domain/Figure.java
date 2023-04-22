package coordinate.domain;

import java.util.List;

public interface Figure {

    List<Point> getPointList();
    double pointResult();

    String getFigureResult();

    boolean hasPoint(int x, int y);

}
