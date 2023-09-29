package Sorting;

public class Insertion_Sort {
    public static void insertionSort(int arr[]){
        for (int i=1; i<arr.length;i++){              //Outer Loop i.e. no. of elements that are to be sorted which means even if 4 elments in an array of 5 would be replaced the array would get sorted
            int curr = arr[i];
            int prev = i-1;
            while(prev>=0 && arr[prev]> curr){     //Change > to < to change the orientaion of array form increasing to decreasing || Finding out the correct position to insert
                arr[prev + 1 ] = arr[prev];            // Pushing back the elements which are greater
                prev--;
            }
                //Insertion
                arr[prev+1] = curr;
        }
    }
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

public static void main(String args[]) {
        int arr[] = { 5, 4, 1, 2, 3 };
        insertionSort(arr);
        printArray(arr);
    }
}
