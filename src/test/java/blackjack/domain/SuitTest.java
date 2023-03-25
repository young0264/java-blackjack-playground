package blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class SuitTest {

    @Test
    void getName() {
        assertThat(Suit.HEARTS.getName()).isEqualTo("하트");
    }

    @Test
    void getNameByOf() {
        assertThat(Suit.of("하트")).isEqualTo(Suit.HEARTS);
    }

    @Test
    void suitByOfError() {
        assertThatIllegalArgumentException().isThrownBy(() -> Suit.of("없는이름"));
    }

}