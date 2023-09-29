public class Reverse_an_ARRAY {
    // private static int i;
    public static void reverse_array(int numbers [] ){
        int first = 0 ; int last = numbers.length-1;
            while(first < last){                            // Swap
                int temp = numbers[last] ;
                numbers[last] = numbers[first];
                numbers[first] = temp;
                first ++;
                last --;
        }
    }
    public static void main (String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,22,33,55,101,111,222};
            System.out.print("This is the Original Array "); 
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] +" "); 
        }
 System.out.println();


        reverse_array(numbers);

         System.out.print("This is the Reversed Array "); 
            for (int i = 0; i < numbers.length; i++){
                System.out.print(numbers[i] + " ");     
            }
            System.out.println();
        // System.out.println("This is the Original Array" + numbers);
        // System.out.println("This is the Reversed Array" + reverse_array(numbers[]););
    }
}
