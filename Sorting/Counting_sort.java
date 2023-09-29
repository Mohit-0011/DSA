package Sorting;

public class Counting_sort {
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;

        for (int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count [] = new int [largest+1];     //Frequency 
        for (int i=0; i<arr.length; i++){
            count[arr[i]]++;
        }
        //Sorting
        int j =0;
        for (int i=0; i<count.length; i++){
            while (count[i]> 0 ){
                arr[j] =i;                  //Initiating the frequency count with one 
                j++;
                count[i]--;                 //Reducing the value of the count by one one as we update 

            } 
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        int arr[] = { 5, 4, 1,4,4,5,2,1,4,87,8,54,5,412,6,48,5,5,46, 2, 3 };
        countingSort(arr);
        printArray(arr);
    }
}