public class Prefix_Approach_Optimized_Approach {
    public static void max_subarray(int numbers[]){


        int current_sum = 0;
        int maximum_sum = Integer.MIN_VALUE;
        int prefix[] = new int [numbers.length];   // Initiation Prefix sum

        prefix[0]  = numbers[0]; // The sum at the 0th index of the numbers array would be 0

        //Calculating Prefix Length

        for (int i = 1; i < prefix.length; i++) {
            prefix[i]= prefix[i-1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) { // First Loop For First Value
            int first = i;

            for (int j = i; j < numbers.length; j++) { // Second Loop For Last Value
                int last = j;

                current_sum = first ==0 ? prefix[last] : prefix[last] - prefix [first -1];


                // for (int k = first; k <= last; k++) { // Third Loop For Values inbetween First and Last

                //     // SubArray Sum
                //     current_sum += numbers[k];
                // }
                // System.out.println(current_sum);
                    if (maximum_sum < current_sum) {
                        maximum_sum = current_sum;
                    }        
                
            }
        }
        System.out.print("The Maximum Sum is : " + maximum_sum);
    } 

    public static void main(String args[]) {
        int numbers[] = {1,-2,6,-1,3};
        max_subarray(numbers);
        // System.out.print("The Maximum Sum is : " + maximum_sum());
    }
}