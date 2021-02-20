package algorytmy.implementacje;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class EuclidesAlgorythmTest {

    private EuclidesAlgorythm euclidesAlgorythm = new EuclidesAlgorythm();

    @Test
    void shouldReturnGreatestCommonDivisor() {
        // given
        int a = 282;
        int b = 78;
        // when
        int greatestCommonDivisor = euclidesAlgorythm.greatestCommonDivisor(a, b);
        // then
        assertThat(greatestCommonDivisor).isEqualTo(6);
    }
}