package problems.math;

public class Pattern {
    /*
     *
     * read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,
     * 88,86,84,82,80,78,76,74,72,70,
     * 67,64,61,58,55,52,49,46,43,40,
     * 36,32,28,24,20,16,12,8,4,0
     *
     */

    public static void main(String[] args) {

        //write your code here
        int i;
        for (i =100; i>=90; i--){
            System.out.print(i+",");
        }
        System.out.println();

        for (i =88; i>=70; i=i-2){
            System.out.print(i+",");
        }
        System.out.println();

        for (i =67; i>=40; i=i-3){
            System.out.print(i+",");
        }
        System.out.println();

        for (i =36; i>=0; i=i-4){
            System.out.print(i+",");
        }

    }
}
