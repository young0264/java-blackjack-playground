package calculator;

import java.util.Arrays;

public class StringAddCalculator {
    public static final String SEPERATOR = ",|:|;|\n|//";

    public static Integer makeNumberToSum(String str) {
        if (isEmptyStr(str)) {
            return 0;
        }
        return Arrays.stream(str.split(SEPERATOR))
                .mapToInt(Integer::parseInt)
                .filter(StringAddCalculator::isNotMinus)
                .sum();
    }

    public static boolean isNotMinus(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("음수값은 포함될 수 없습니다.");
        }
        return num > 0;
    }

    public static boolean isEmptyStr(String str) {
        if (str == null | str == "") {
            return true;
        }
        return false;
    }

}
