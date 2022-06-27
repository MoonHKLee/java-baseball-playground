package numberBaseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void check() {
        Game game = new Game("123");

        String actual1 = game.check("123");
        String actual2 = game.check("312");
        String actual3 = game.check("321");
        String actual4 = game.check("456");
        String actual5 = game.check("351");
        String actual6 = game.check("153");
        String actual7 = game.check("145");
        String actual8 = game.check("761");
        String actual9 = game.check("138");

        assertThat(actual1).isEqualTo("3스트라이크");
        assertThat(actual2).isEqualTo("3볼");
        assertThat(actual3).isEqualTo("2볼 1스트라이크");
        assertThat(actual4).isEqualTo("낫싱");
        assertThat(actual5).isEqualTo("2볼");
        assertThat(actual6).isEqualTo("2스트라이크");
        assertThat(actual7).isEqualTo("1스트라이크");
        assertThat(actual8).isEqualTo("1볼");
        assertThat(actual9).isEqualTo("1볼 1스트라이크");
    }
}
