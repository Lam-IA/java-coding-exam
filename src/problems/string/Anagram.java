package problems.string;

import java.util.Arrays;

public class Anagram {

    /*
     *
     * write a Java Program to check if the two String are Anagram
     * two Strings are called Anagram when there is same character but in different order
     * examples: "CAT" and "ACT", "ARMY" and "MARY"
     *
     */
    public static void anagram(String str1, String str2) {

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean anag = Arrays.equals(charArray1, charArray2);
        if (anag) {
            System.out.println(str1 + " and " + str2 + " are anagram.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
    public static void main(String[] args) {

        //run your code here
        anagram("CAT","ACT");

    }

}
