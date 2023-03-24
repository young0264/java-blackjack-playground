package blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class NameTest {


    @Test
    void create_이름() {
        Assertions.assertThat(new Name("새로운이름")).isInstanceOf(Name.class);
    }

    @Test
    void 이름이_공백인_경우() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Name(""));
    }
}