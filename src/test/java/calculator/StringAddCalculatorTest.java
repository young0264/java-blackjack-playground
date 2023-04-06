package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest {

    // 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환 (예: “” => 0, "1,2" => 3, "1,2,3" => 6, “1,2:3” => 6)
    //1. 문자열을 구분하는 기능

    @Test
    void 구분자로_구분된_숫자의_합() {
        String str = "1,2:5,4";

        Integer sumNum = StringAddCalculator.makeNumberToSum(str);
        assertThat(sumNum).isEqualTo(12);
    }
    @Test
    void 구분자값이_없을때_숫자의_합() {
        String str = "";
        Integer sumNum = StringAddCalculator.makeNumberToSum(str);
        assertThat(sumNum).isEqualTo(0);
    }

    @Test
    void 문자열_null_zero_검증() {
        String str = "";
        assertThat(StringAddCalculator.isValidStr(str)).isFalse();
    }
}
