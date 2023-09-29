public class Print_SubArray {
    public static void sub_array(int numbers[]){

        int ts = 0;                         // Total SubArrays

        for(int i=0; i<numbers.length ; i++){             // First Loop For First Value
            int first = i;

            for (int j=i; j<numbers.length ; j++){        //Second Loop For Last Value
                int last = j;
                for(int k = first ; k<= last ; k++){      //Third Loop For Values inbetween First and Last

                    System.out.print(numbers[k]+ " ");
                }System.out.println();
                    ts++;
            }System.out.println();

        }System.out.println();

      System.out.print("Total SubArrays are : " + ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        sub_array(numbers);

    }
}