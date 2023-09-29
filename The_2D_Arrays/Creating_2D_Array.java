package The_2D_Arrays;

import java.util.*;

public class Creating_2D_Array {
    public static boolean search(int matrix[][], int key){
    for (int i = 0; i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){        
                if (matrix[i][j] == key){
                    System.out.print("Found the Element at ( " + i + " , " + j + " )");
                    return true;
                }
            }
        }
        System.out.print("Not Found");
        return false;
    }


    public static void main(String args[]){
        int matrix[][] = new int [3][3]; //Double Squar Brackets are used for 2D arrays
        int n=matrix.length , m=matrix[0].length; //matrix[0].length; gives the rows of the matrix    
         //Total number of Cells = Rows*Columns
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<n;i++){
            for (int j=0;j<m;j++){
                matrix[i][j] = sc.nextInt();
                // sc.close();
            }
        }  
        //Output
        for (int i = 0; i<n;i++){
            for (int j=0;j<m;j++){
            System.out.print(matrix[i][j] + " ");
            sc.close();
    }
    System.out.println();
}     search(matrix, 7);

    }
}