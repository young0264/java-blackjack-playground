package calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringAddCalculator {
    public static final String SEPERATOR = ",|:";
    public static Integer makeNumberToSum(String str) {
        return Arrays.stream(str.split(SEPERATOR)).mapToInt(Integer::parseInt).sum();
    }
}
