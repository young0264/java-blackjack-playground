package coordinate.view;

import coordinate.domain.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputView {

    private static final String INPUT_COORDINATE = "좌표를 입력하세요.";
    private static final String DASH_DALIMETER = "-";
    private static final String INVALID_COORDINATE_ERROR = "올바르지 않은 입력값입니다.";
    private static final String DUPLICATED_COORDINATE_ERROR = "중복된 좌표값이 존재합니다.";

    private static Scanner scanner = new Scanner(System.in);

    public static Figure inputCoordinates() {
        System.out.println(INPUT_COORDINATE);
        return inputCoordinates(scanner.nextLine());
    }

    public static Figure inputCoordinates(String coordinateStr) {
        try {
            checkAccuracyOfCoordinateStr(coordinateStr);
            List<Point> points = generatePoints(coordinateStr);
            return FigureFactory.create(points);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return inputCoordinates();
        }
    }

    private static List<Point> generatePoints(String coordinateStr) {
        String[] coordinateArr = coordinateStr.split(DASH_DALIMETER);

        List<Point> points = new ArrayList<>();
        for (String pointStr : coordinateArr) {
            points.add(generatePoint(pointStr));
        }
        checkDuplicationOf(points);
        return points;
    }

    private static void checkDuplicationOf(List<Point> points) {
        if (points.size() != new HashSet<>(points).size()) {
            throw new IllegalArgumentException(DUPLICATED_COORDINATE_ERROR);
        }
    }

    private static Point generatePoint(String pointStr) {
        Pattern pattern = Pattern.compile("\\(([0-9]{1,2}),([0-9]{1,2})\\)");
        Matcher matcher = pattern.matcher(pointStr);
        if (matcher.matches()) {
            int x = Integer.parseInt(matcher.group(1));
            int y = Integer.parseInt(matcher.group(2));
            return new Point(x,y);
        }
        throw new IllegalArgumentException(INVALID_COORDINATE_ERROR);
    }

    private static void checkAccuracyOfCoordinateStr(String coordinateStr) {
        Pattern pattern = Pattern.compile("(\\([0-9]{1,2},[0-9]{1,2}\\))(-(\\([0-9]{1,2},[0-9]{1,2}\\))){0,3}");
        Matcher matcher = pattern.matcher(coordinateStr);
        if (!matcher.matches()) {
            throw new IllegalArgumentException(INVALID_COORDINATE_ERROR);
        }
    }


}
