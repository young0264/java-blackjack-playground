package blackjack.domain;

import blackjack.domain.card.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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