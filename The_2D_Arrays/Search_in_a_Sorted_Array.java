package The_2D_Arrays;

public class Search_in_a_Sorted_Array {
    public static boolean stair_Case_Search(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {

            if (matrix[row][col] == key) {
                System.out.print("Key Found at ( " + col + " , "+ row + " )");
                return true;
            }

            else if (key < matrix[row][col]) {                  // If the key is less than the cell value move to the left by decreasing the cell
                col--;

            } 
            else { // If the key is more the an the cell value move Downwards
                row++;
            }
        }
        System.out.println("Not Found Key");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10,20,30,40 },
                           { 15,25,35,45 },
                           { 27,29,37,48 },
                           { 32,33,39,50 }};
        int key = 25;
        stair_Case_Search (matrix , key);

    }
}
