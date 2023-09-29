package Sorting;

import java.util.*;

public class Inbuilt_sort {
    public static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]) {
        Integer arr[] = { 5, 4, 1, 2, 3 };
        Arrays.sort(arr);           //We can also give input Starting index as well as ending index        
        Arrays.sort(arr, 0,3);           //We can also give input Starting index as well as ending index        
        Arrays.sort(arr ,Collections.reverseOrder());      // Change int arr to Integer arr to work  It is because the reverseorder only works over objects
        printArray(arr);        
    }
}
