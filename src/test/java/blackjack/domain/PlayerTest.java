package blackjack.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class PlayerTest {

    @Test
    void create() {
        assertThat(new Player("새플레이어")).isInstanceOf(Player.class);
    }



}
