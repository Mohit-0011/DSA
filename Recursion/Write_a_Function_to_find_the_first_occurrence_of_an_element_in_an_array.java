package Recursion;

public class Write_a_Function_to_find_the_first_occurrence_of_an_element_in_an_array {

    public static int firstOccurence(int arr[], int key, int i ){
        if (i == arr.length){
            return -1;
        }
        if (arr[i] ==  key){
            return i;
        }
        return firstOccurence(arr, key, i+1);
    }
    public static void main (String args[]){
        // int key = 5;
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firstOccurence(arr, 5 , 0));
    }
}