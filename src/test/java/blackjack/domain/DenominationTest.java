package blackjack.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class DenominationTest {

    @Test
    void getScore() {
        assertThat(Denomination.JACK.getScore()).isEqualTo(10);
    }

    @Test
    void getScoreByOf() {
        assertThat(Denomination.of(10)).isEqualTo(Denomination.TEN);
    }

    @Test
    void denominate_에러_throw() {
        assertThatIllegalArgumentException().isThrownBy(() -> Denomination.of(11));
    }

    @Test
    void is_에이스인지() {
        assertThat(Denomination.ACE.isAce()).isEqualTo(true);
    }

}