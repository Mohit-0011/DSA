package Sorting;


public class bubble_sort {
    public static void bubbleSort(int arr[]){
        for(int turns = 0 ; turns<arr.length - 1 ; turns++){                            //Outter loop for Turns         n times
            for (int j=0; j<arr.length -1 -turns; j++)                                 //Inner Loop To push the greater element    n-1-turns times
                if(arr[j]> arr[j+1]){                                                 //Checking if the current element is bigger than the next element on the index
                    
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;                                                  // Swaping the indexes of the larger elment and pusing it deep to the end of the array
                    
                }
        } 

    }
    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }
   public static void main (String args[]){
    int arr[]= {5,4,1,2,3};
    bubbleSort(arr);
    printArray(arr);

   }
}
