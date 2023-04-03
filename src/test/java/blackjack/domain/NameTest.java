package blackjack.domain;

import blackjack.domain.participant.Name;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

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