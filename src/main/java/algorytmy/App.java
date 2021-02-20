package algorytmy;

import algorytmy.implementacje.BubbleSort;

public class App {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] numbers = {15,12,3,7,99,1,54};

        bubbleSort.sort(numbers);
    }
}
