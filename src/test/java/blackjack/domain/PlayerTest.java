package blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @Test
    void create() {
        assertThat(new Player("새플레이어")).isInstanceOf(Player.class);
    }

    @Test
    void 이름이_공백인_경우() {
        assertThatIllegalArgumentException().isThrownBy(() -> new Player(""));
    }

}
