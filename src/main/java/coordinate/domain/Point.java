package coordinate.domain;


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        validateXY(x, y);
        this.x = x;
        this.y = y;
    }

    private void validateXY(int x, int y) {
        if (x > 24 || y > 24 || x < 0 || y < 0) {
            throw new IllegalArgumentException("X, Y 좌표 모두 24를 넘을 수 없습니다.");
        }
    }

    public double getLengthEachPoint(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
}
