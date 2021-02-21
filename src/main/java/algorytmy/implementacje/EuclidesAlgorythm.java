package algorytmy.implementacje;

public class EuclidesAlgorythm {

    public int greatestCommonDivisor(int a, int b){
        int find = 0;

        if (a == b){

            find = a;

        } else if (a > b){

            if (b == 0 ) return find = 0;
            while (a % b != 0){

                int rest = a % b;
                a = b;
                b = rest;

            }
            find = b;

        } else {

            if (a == 0 ) return find = 0;
            while (b % a != 0){

                int rest = b % a;
                b = a;
                a = rest;
            }
            find = a;

        }
        return find;
    }
}
