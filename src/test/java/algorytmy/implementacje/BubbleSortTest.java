package algorytmy.implementacje;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    void shouldReturnSortedArray() {
        // given
        int[] numbers = {15,12,3,7,99,1,54};
        // when
        int[] sort = bubbleSort.sort(numbers);
        // then
        assertThat(sort).containsExactly(1,3,7,12,15,54,99);
    }
    @Test
    void shouldReturnOneElementArray() {
        // given
        int[] numbers = {15};
        // when
        int[] sort = bubbleSort.sort(numbers);
        // then
        assertThat(sort).contains(15);
    }
    @Test
    void shouldNotReturnNull() {
        // given
        int[] numbers = {};
        // when
        int[] sort = bubbleSort.sort(numbers);
        // then
        assertThat(sort).contains();
    }
}