package problems.math;

public class FindLowestDifference {
    /*
     *
     * consider these below two arrays (array1 and array2)
     * find the lowest difference between the two arrays cells
     * hint: the lowest difference between cells is 1
     *
	 */
    public static int abs(int n) {
        if (n < 0)
        {return -n;}
        return n;
    }
    public static void main(String[] args) {

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        int Diff = abs(array1[0]-array2[0]);

        for (int k : array1) {
            for (int i : array2) {
                if (Diff > abs(k - i)) {
                    Diff = abs(k - i);
                }
            }
        }
        System.out.println("The lowest difference  is: " +Diff);



    }
}
