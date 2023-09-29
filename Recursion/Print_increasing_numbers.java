package Recursion;

public class Print_increasing_numbers {
    public static void printInc(int n){
        if (n == 1) {       //Base Condition
            System.out.print( n + " ");
            return;
        }
        printInc(n-1);
        System.out.print( n + " ");
    }
    public static void main (String Args[]){
        int n = 10;
        printInc(n);
    }
}

