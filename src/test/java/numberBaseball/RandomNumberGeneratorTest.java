package numberBaseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {

    @Test
    void generate() {
        String generatedNumber = RandomNumberGenerator.generate();

        assertThat(generatedNumber.length()).isEqualTo(3);

        assertThat(generatedNumber.charAt(0)).isNotEqualTo(generatedNumber.charAt(1));
        assertThat(generatedNumber.charAt(0)).isNotEqualTo(generatedNumber.charAt(2));
        assertThat(generatedNumber.charAt(1)).isNotEqualTo(generatedNumber.charAt(2));

        assertThat(generatedNumber.charAt(0)).isNotEqualTo('0');
        assertThat(generatedNumber.charAt(1)).isNotEqualTo('0');
        assertThat(generatedNumber.charAt(2)).isNotEqualTo('0');

    }
}
