public class Kadans_Algorithm_Max_subArray_sum {
    public static void max_subarray(int numbers[]) {

        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            curr_sum = curr_sum + numbers[i]; 
            if (curr_sum < 0) {
                curr_sum = 0;
            }

            // if (curr_sum> max_sum){
            // max_sum = curr_sum;
            // }
            max_sum = Math.max(curr_sum, max_sum); // A fucntion of Math used to store the maximum value into max_sum variable
        }
        System.out.print("Maximum Sum : " + max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        max_subarray(numbers);
    }
}
