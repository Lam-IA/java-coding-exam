package readfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Collections;
import java.util.LinkedList;
import java.io.IOException;

public class ReadTextFile {
    /*
     *
     * read the below textFile and print to console:
     * file-dat.txt
     *
     * use FileReader/BufferedReader classes
     * use try..catch block to handle exceptions
     *
     * After reading from file using BufferedReader API, store each word into LinkedList. So each word
     * should construct a node in LinkedList. Then iterate/traverse through the list to retrieve as FIFO (first in first out)
     * order from LinkedList
     *
     * find and print out the number of the words in th text
     *
     */

    public static void main(String[] args) throws IOException {

        //write your code here
        LinkedList<String> list = new LinkedList<>();
        String [] str;

        File f = new File("C:/Users/Dell-Stw/Desktop/java-coding-exam Lamia/src/readfile/file-data");
        BufferedReader BuffRead = new BufferedReader (new FileReader(f));
        String strs;

        while((strs = BuffRead.readLine()) != null) {
            str = strs.split(" ");
            Collections.addAll(list, str);
        }

        System.out.println("The number of the words in the text is: "+list.size());

    }

}
