package algorytmy.implementacje;

public class BubbleSort {

    public int[] sort(int[] tab){

        if (tab == null) return new int[20];

        int bigger = -1;

        for (int i = 0; i < tab.length; i++) {

            for (int j = 0; j < tab.length - 1; j++) {

                if (tab[j] > tab[j+1]){

                    bigger = tab[j];
                    tab[j] = tab[j+1];
                    tab[j+1] = bigger;
                }
            }
        }
        return tab;
    }
}
