package problems.math;

import java.util.Scanner;

public class MakePyramid {

    /*

    Implement a large Pyramid of stars in the screen with java.

          *
         * *
        * * *
       * * * *
      * * * * *
     * * * * * *

     */

    public static void main(String[] args) {

        //write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows needed:");
        int rows = sc.nextInt();
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < rows - i; j++){
                System.out.print(" ");
            }
            for (int k=0; k <= i; k++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
}
