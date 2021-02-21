package algorytmy.implementacje;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;

class BinarySearchTest {

    private BinarySearch binarySearch = new BinarySearch();

    @Test
    void shouldReturnIndexOfSearchingElement() {
        // given
        int number = 2;
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        // when
        int i = binarySearch.binSearch(numbers, number);
        // then
        assertThat(i).isEqualTo(1);
    }
}