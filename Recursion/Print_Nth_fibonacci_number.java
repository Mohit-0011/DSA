package Recursion;

public class Print_Nth_fibonacci_number {

    public static int fib(int n ){
        if (n==0 || n ==1){
            return n ;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm2 - fnm1;

        return fn;

    }
    public static void main (String args[]){
        int n = 25;
        System.out.println(fib(n)); 
    }
}
