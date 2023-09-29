public class max_subArray_sum_Bruteforce_method {
    public static void max_subarray(int numbers[]) {

        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) { // First Loop For First Value
            int first = i;

            for (int j = i; j < numbers.length; j++) { // Second Loop For Last Value
                int last = j;
                current_sum = 0;

                for (int k = first; k <= last; k++) { // Third Loop For Values inbetween First and Last

                    // SubArray Sum
                    current_sum += numbers[k];
                }System.out.println(current_sum);
                    if (maximum_sum < current_sum) {
                        maximum_sum = current_sum;
                    }        
                
            }
        }
        System.out.print("The Maximum Sum is : " + maximum_sum);
    } 

    public static void main(String args[]) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        max_subarray(numbers);
        // System.out.print("The Maximum Sum is : " + maximum_sum());
    }
}