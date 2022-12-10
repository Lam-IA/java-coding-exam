package datastructure.collections;

import java.util.LinkedList;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     * int[] array1 = {1, 3, 2, 4, 8, 9, 0}
     * int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5}
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */
    public static boolean includes (LinkedList<Integer> list, int x) {
        for (Integer integer : list) {
            if (integer == x) {
                return true;
            }
        }
        return false; }
    public static void main(String[] args) {

        //write your code here
        LinkedList <Integer> array1 = new LinkedList<>();
        array1.add(1);
        array1.add(3);
        array1.add(2);
        array1.add(4);
        array1.add(8);
        array1.add(9);
        array1.add(0);
        System.out.println(array1);

        LinkedList <Integer> array2 = new LinkedList<>();
        array2.add(1);
        array2.add(3);
        array2.add(7);
        array2.add(5);
        array2.add(4);
        array2.add(0);
        array2.add(7);
        array2.add(5);
        System.out.println(array2);

        LinkedList <Integer> arrayUnion = new LinkedList<>();
        for (Integer integer : array1) {
            if (!includes(arrayUnion, integer)) {
                arrayUnion.add(integer);
            }
        }

        for (Integer integer : array2) {
            if (!includes(arrayUnion, integer)) {
                arrayUnion.add(integer);
            }
        }

        System.out.println(arrayUnion);

        if(arrayUnion.size() > 0) {
            for(int i = 0 ; i < arrayUnion.size()-1 ; i++)
            {for(int j = i+1 ; j < arrayUnion.size() ; j++)
            {if(arrayUnion.get(i) > arrayUnion.get(j))
            {int tmp = arrayUnion.get(i); arrayUnion.set(i, arrayUnion.get(j)); arrayUnion.set(j, tmp);} } } } // Permuter deux éléments

        System.out.println(arrayUnion);

        LinkedList <Integer> arrayIntersection = new LinkedList<>();

        for (Integer integer : array1) {
            if (includes(array2, integer)) {
                arrayIntersection.add(integer);
            }
        }

        System.out.println(arrayIntersection);

        if(arrayIntersection.size() > 0) {
            for(int i = 0 ; i < arrayIntersection.size()-1 ; i++)
            {for(int j = i+1 ; j < arrayIntersection.size() ; j++)
            {if(arrayIntersection.get(i) > arrayIntersection.get(j))
            {int tmp = arrayIntersection.get(i); arrayIntersection.set(i, arrayIntersection.get(j)); arrayIntersection.set(j, tmp);} } } } // Permuter deux éléments

        System.out.println(arrayIntersection);

        LinkedList <Integer> arrayDifference = new LinkedList<>();

        for (Integer integer : arrayUnion) {
            if (!includes(arrayIntersection, integer)) {
                arrayDifference.add(integer);
            }
        }

        System.out.println(arrayDifference);

        if(arrayDifference.size() > 0) {
            for(int i = 0 ; i < arrayDifference.size()-1 ; i++)
            {for(int j = i+1 ; j < arrayDifference.size() ; j++)
            {if(arrayDifference.get(i) > arrayDifference.get(j))
            {int tmp = arrayDifference.get(i); arrayDifference.set(i, arrayDifference.get(j)); arrayDifference.set(j, tmp);} } } } // Permuter deux éléments

        System.out.println("difference of the two arrays is:"+arrayDifference);



    }

}
