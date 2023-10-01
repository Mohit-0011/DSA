package Recursion;

public class Check_if_a_given_array_is_sorted_or_not {

    public static boolean isSorted (int arr[],int i ){
        if (i == arr.length-1 ){            //i.e. i is equal to the last elment of the array then mark as true.
            return true;
        }

        if (arr[i] > arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);        

        //This denotes that if at any point the value of i is greater than i+1 (in case of assending) Then the array is not sorted . Also we would assume that using recurssion all other values of array would get checked .

    }
    public static void main (String args[]){
        int arr [] = {1,2,3,4};
        System.out.println(isSorted(arr, 0)); 
    }
    
}
