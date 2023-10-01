package Recursion;

public class Print_sum_of_first_n_natural_numbers {

    public static int clacSum (int n){
    if ( n==1){                 // Base Case
        return 1;               //It is because we know that the sum of the 1 natural numbers would always be 1
    }    
    int Snm1 = clacSum(n-1);
    int Sn = n + Snm1;
    return Sn;
    }
    public static void main (String args[]){
        int n = 5;
        System.out.println(clacSum(n));
    }
}
