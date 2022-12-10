package problems.math;

import java.util.ArrayList;

public class PrimeNumber {

    /*
     *
     * find collections of Prime numbers from number 2 to 1 million.
     * output number of Prime numbers on the given range.
     *
     */

    public static void main(String[] args) {

        //write your code here
        int i,n;
        boolean nb;

        ArrayList<Integer> PrimeNb = new ArrayList<>();

        for (i=2 ; i< 100000; i++){
            nb = true;
            for (n=2 ; n<i; n++) {
                if (i % n == 0) {
                    nb = false;
                    break;
                }
            }
            if (nb) PrimeNb.add(i);
        }
        System.out.println("Prime number from 1 to 1000000 are: "+PrimeNb);


    }
}
