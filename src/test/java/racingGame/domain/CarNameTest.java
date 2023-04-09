package racingGame.domain;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class CarNameTest {


    @Test
    void 문자열_쉼표기준으로_split_검증() {
        String strNames = "pobi,crong,honux";
        String[] nameArr = CarName.strSplitByComma(strNames);
        assertThat(nameArr.length).isEqualTo(3);
        assertThat(nameArr[0]).isEqualTo("pobi");
        assertThat(nameArr[1]).isEqualTo("crong");
        assertThat(nameArr[2]).isEqualTo("honux");
    }

    @Test
    void v1() {
        System.out.println(new Random().nextInt(10));
    }

}
