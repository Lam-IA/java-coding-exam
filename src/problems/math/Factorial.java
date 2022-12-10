package problems.math;

public class Factorial {

    /*
     *
     * factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     * write a java program to find Factorial of a given number
     * you can use Recursion or Iteration
     *
     */
    public static int Facto(int n){
        if (n == 0)
            return 1;
        else
            return(n * Facto (n-1));
    }
    public static void main(String[] args) {

        //run your code here
        System.out.println("factorial of 5! is :"+Facto(5));

    }

}
