package Recursion;

public class Write_a_Function_to_find_the_last_occurrence_of_an_element_in_an_array {
    
    public static int lastOccurence(int arr[], int key, int i ){
        if (i ==  arr.length){
            return -1; 
        }

        int isFound = lastOccurence(arr, key, i+1);
        if (isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
        }
    
    public static void main (String args[]){
        // int key = 5;
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(lastOccurence(arr, 5 , 0));
    }
}
