package datastructure.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {

        //write your code here
        Set<Integer> elt= new HashSet<>();
        Collections.addAll(elt, 3, 3, 4, 1, 7, 1, 0, 7, 4, 5, 0, 9, 8);
        System.out.println(elt);
        for(int i: elt){
            System.out.println(i);
        }
        System.out.println("the number of set elements is : "+elt.size());
        elt.remove(0);
        elt.remove(3);
        System.out.println(elt);
        System.out.println("the number of set elements after removing 3 and 0 is : "+elt.size());

    }
}
