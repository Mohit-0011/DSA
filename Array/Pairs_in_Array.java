public class Pairs_in_Array {
    public static void pairs(int numbers[]){
        int tp=0;        // Total Pair
        // First loop First digit
        for (int i=0; i < numbers.length ; i++){
            int current = numbers[i];
            // System.out.print("Pairs are ");
            
            for (int j=i+1; j < numbers.length ; j++){ // j=i+1 is used so that already existing pairs do not get printed in any other orientation
                int sec = numbers[j];
                System.out.print("(" + current + "," + sec + ")");
        tp++;

        }
        System.out.println();
    }
        System.out.println("Total Pairs : " + tp);

}
    public static void main (String args[]){
        int numbers[] = {1,2,3,4,5,6};
        pairs(numbers);
    }
}
