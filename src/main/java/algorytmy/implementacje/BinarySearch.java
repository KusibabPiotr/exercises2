package algorytmy.implementacje;

public class BinarySearch {

    public int binSearch(int[] numbers,int numberToFind){

        int max = numbers.length-1;
        int min = 0;
        int mid = -2;
        int indexFound = -1;

        while (indexFound != mid){
            mid =  (max + min) / 2;

            if (numbers[mid] == numberToFind){
              indexFound = mid;
            } else if (numbers[mid] < numberToFind){
                min = mid + 1;
            } else if (numbers[mid] > numberToFind){
                max = mid - 1;
            }
        }
        return indexFound;
    }
}
