package Recursion;

public class Print_decending_numbers{
    public static void printdec(int n){

        if (n == 1 ){           //Base condition in case of the last remaining number
            System.out.print(n);
            return;
        }
        
        System.out.print( n + " ");
        printdec(n-1);          //Calling the function again and leaving the remaining task to it to complete

    }
    public static void main (String Args[]){
        int n = 10;         //Input Value
        printdec(n);
    }

}
