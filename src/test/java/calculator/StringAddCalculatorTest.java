package calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddCalculatorTest {

    @Test
    void 구분자로_구분된_숫자의_합() {
        String str = "1,2:5;4//3\n2";
        Integer sumNum = StringAddCalculator.makeNumberToSum(str);
        assertThat(sumNum).isEqualTo(17);
    }
    @Test
    void 입력이_null_혹은_없을때_합은0() {
        String str = "";
        Integer sumNum = StringAddCalculator.makeNumberToSum(str);
        assertThat(sumNum).isEqualTo(0);

        String str2 = null;
        Integer sumNum2 = StringAddCalculator.makeNumberToSum(str2);
        assertThat(sumNum2).isEqualTo(0);
    }

    @Test
    void 숫자_하나일때() {
        String str = "1";
        Integer number = StringAddCalculator.makeNumberToSum(str);
        assertThat(number).isEqualTo(1);
    }

    @Test
    void 문자열_null_zero_검증() {
        String str = "";
        assertThat(StringAddCalculator.isEmptyStr(str)).isTrue();
    }

    @Test
    void 양수는_참_리턴() {
        assertThat(StringAddCalculator.isNotMinus(1)).isTrue();
    }
    @Test
    void 음수는_예외_리턴() {
        assertThatThrownBy(() -> StringAddCalculator.isNotMinus(-1))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음수값은 포함될 수 없습니다.");
    }
    @Test
    void 음수가_포함되면_예외() {
        String str = "-1,2,3";
        assertThatThrownBy(() -> {
            StringAddCalculator.makeNumberToSum(str);
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("음수값은 포함될 수 없습니다.");
    }

}
