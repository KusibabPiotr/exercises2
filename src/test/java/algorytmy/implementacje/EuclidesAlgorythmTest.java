package algorytmy.implementacje;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class EuclidesAlgorythmTest {

    private EuclidesAlgorythm euclidesAlgorythm = new EuclidesAlgorythm();

    @Test
    void shouldReturnGreatestCommonDivisorAGreaterThanB() {
        // given
        int a = 282;
        int b = 78;
        // when
        int greatestCommonDivisor = euclidesAlgorythm.greatestCommonDivisor(a, b);
        // then
        assertThat(greatestCommonDivisor).isEqualTo(6);
    }

    @Test
    void shouldReturnOneOfGivenNumbers() {
        // given
        int a = 2;
        int b = 2;
        // when
        int greatestCommonDivisor = euclidesAlgorythm.greatestCommonDivisor(a, b);
        // then
        assertThat(greatestCommonDivisor).isEqualTo(2);
    }

    @Test
    void shouldReturnGreatestCommonDivisorBGreaterThanA() {
        // given
        int a = 78;
        int b = 282;
        // when
        int greatestCommonDivisor = euclidesAlgorythm.greatestCommonDivisor(a, b);
        // then
        assertThat(greatestCommonDivisor).isEqualTo(6);
    }

    @Test
    void shouldReturn0() {
        // given
        int a = 0;
        int b = 22;
        // when
        int greatestCommonDivisor = euclidesAlgorythm.greatestCommonDivisor(a, b);
        // then
        assertThat(greatestCommonDivisor).isEqualTo(0);
    }



}