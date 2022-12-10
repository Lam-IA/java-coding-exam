package datastructure.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {

        //write your code here
        LinkedList<String> WorldCup = new LinkedList<>();
        WorldCup.add("France");
        WorldCup.add("Germany");
        WorldCup.add("Brazil");
        WorldCup.add("Portugal");

        for( String fruits: WorldCup){
            System.out.println(fruits);
        }
        WorldCup.remove("Germany");
        Iterator<String> iterator = WorldCup.iterator();
        for (String s : WorldCup) {
            System.out.println(s);
        }
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
