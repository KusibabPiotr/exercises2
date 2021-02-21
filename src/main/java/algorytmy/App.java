package algorytmy;

import algorytmy.implementacje.BinarySearch;
import algorytmy.implementacje.BubbleSort;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {19,15,12,2,5,6,13};
        System.out.println(Arrays.toString(bubbleSort.sort(numbers)));
    }
}
