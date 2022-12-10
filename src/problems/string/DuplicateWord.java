package problems.string;

import java.util.LinkedList;

public class DuplicateWord {

    /*
     *
     * write a java code to find the duplicate words and their number of occurrences in the string
     * also Find the average length of the words
     *
     */
    public static int numbOccu(String str, String word) {
        String[] strings = str.split(" ");
        int w = 0;
        for(String words : strings) {
            if(words.equals(word)) {
            w = w + 1;
            }
        }
        return w;
    }
    public static boolean includes(LinkedList<String> list, String word) {
        for (String s : list) {
            if (word.equals(s)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        String str = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language, Java is also coffee";

        //run your code here
        LinkedList<String> list = new LinkedList<>();
        String[] strs = str.split(" ");

        for(String word : strs) {
            if(!includes(list, word)) {
            list.add(word);
            }
        }
        for (String s : list) {
            System.out.println(s + "\t" + numbOccu(str, s));
        }


    }

}


