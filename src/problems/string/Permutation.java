package problems.string;

public class Permutation {

    /*
     *
     * permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
     * write Java program to compute all permutation of a String
     *
     */
    public static void PermutationString(String str, String ans){
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String s = str.substring(0, i) + str.substring(i + 1);
            PermutationString(s, ans + c);
        }
    }
    public static void main(String[] args) {
        //run your code here
        String p = "ABC";
        PermutationString(p, "");
    }
}
