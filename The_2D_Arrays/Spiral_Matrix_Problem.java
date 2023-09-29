package The_2D_Arrays;

public class Spiral_Matrix_Problem{
    public static void printSpiral(int matrix[][]){
        int start_Row = 0;
        int start_Col = 0;
        int end_Row = matrix.length-1;
        int end_Col = matrix[0].length-1;
        
        while ( start_Row <= end_Row && start_Col <= end_Col ){

            //TOP
            for ( int j = start_Col ; j<= end_Col; j++){
                System.out.print( matrix[start_Row][j]+" ");
            }
            //Right
            for ( int i = start_Row + 1; i<= end_Row; i++){
                System.out.print( matrix[i][end_Col]+" ");
            }
            //Bottom
            for ( int j = end_Col -1; j<= start_Col; j--){
                System.out.print( matrix[end_Row][j]+" ");
            }
            //Left
           for ( int i = end_Row - 1; i<=start_Row +1 ; i--){      
                System.out.print( matrix[i][start_Col]+" ");
            }
            start_Col++;
            start_Row++;
            end_Col--;
            end_Row--;
        }
        System.out.println();

    }
public static void main (String args[]){
    int matrix [][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};
        printSpiral(matrix);
    }
}