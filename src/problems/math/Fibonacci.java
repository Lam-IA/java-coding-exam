package problems.math;

public class Fibonacci {

    /*
     *
     * write 30 Fibonacci numbers with java
     * 0,1,1,2,3,5,8,13
     *
    */
    public static int Fib(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            return Fib(n - 1) + Fib(n - 2);
        }
    }
    public static void main(String[] args) {
        //run your code here
        for (int i=0;i<=30; i++){
            System.out.println("The 30th Fibonacci numbers are:"+Fib(i));
        }

    }
}
