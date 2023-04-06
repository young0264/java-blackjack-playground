package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static final String SEPERATOR = ",|:|;|\n|//";

    public static Integer makeNumberToSum(String str) {
        if (!isValidStr(str)) {
            return 0;
        }
        return Arrays.stream(str.split(SEPERATOR)).mapToInt(Integer::parseInt).sum();
    }

    public static boolean isValidStr(String str) {
        if (str == null | str == "") {
            return false;
        }
        return true;
    }
}
