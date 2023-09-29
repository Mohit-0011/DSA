// import java.util.*;
public class Finding_the_largestNumber_smallestNumber {
// Creating a variable and comparing its value again and again to find the largest number and updating the value of the variable
// The default value of our largest variable would be - Infinity (Integer.MIN_VALUE) (To be imported form java.util)as it is the lowest available integer

    // public static int largestNumber(int numbers[]){
    //     int largest = Integer.MIN_VALUE;    //  -INFINITY
        // for(int i = 0 ; i<numbers.length; i++){
        //     if(largest < numbers[i]){
        //         largest = numbers[i];
        //     }
        // }
        // return largest;
    public static int smallestNumber(int numbers[]){
        int smallest = Integer.MAX_VALUE;   //  +INFINITY
        for(int i = 0 ; i<numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args []){
        int numbers[] = {-11,1,332,35,34,75,55,237,28,9,10};
        // System.out.println("Largest Number is : " + largestNumber(numbers));
            System.out.println("smallest Number is : " + smallestNumber(numbers));
    }
    
}
