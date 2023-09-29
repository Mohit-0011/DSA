package The_2D_Arrays;

public class Diagonal_Sum_BruteForce_Method {
    public static int dia_sum(int matrix[][]){
        int sum = 0;

        for (int i = 0; i<= matrix.length ; i ++){
            for (int j = 0 ; j<matrix[0].length ; j++){        //Primary Diagonal

                if (i==j){
                    sum += matrix[i][j];}
                else if (i + j == matrix.length -1){        //Secondary Diagonal
                    sum += matrix[i][j];
                }
            }
        }
        return sum;

    }

  public static void main (String args[]){
    int matrix [][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        System.out.println(dia_sum(matrix));
    }  
}
