package datastructure.collections;

import java.util.ArrayList;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here
        ArrayList<String> Fruits = new ArrayList<>();
        Fruits.add("Cherry");
        Fruits.add("Banana");
        Fruits.add("Pear");

        for(int i = 0; i < Fruits.size(); i++) {
            System.out.println(i + " : " + Fruits.get(i));
        }

        Fruits.remove(2);
        for (String fruit : Fruits) {
            System.out.println(fruit);
        }

    }
}
