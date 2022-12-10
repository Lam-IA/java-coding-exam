package problems.string;

public class DetermineLargestWord {

    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";

        //write your code here
        String [] x = str.split(" ");

        int lengthWord = x[0].length();
        String longestWorld = x[0];

        for(String word : x) {
            if( word.length() > lengthWord) {
            lengthWord = word.length();
            longestWorld = word;
            }
        }
        System.out.println("The longest word is: "+ longestWorld + " and its length is: " + longestWorld.length());
    }

}
