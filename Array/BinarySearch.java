public class BinarySearch{
    public static int binary_Search(int numbers[] ,int key){
        int start = 0 ; int end = numbers.length-1;
        while(start <= end){
            int mid = (start + end)/2;

            // Comparision
            if ( key == numbers[mid]){          // KEY FOUND // (numbers[mid]) is used to specify the index value of the mid variable

                return mid;
            }
            if (numbers[mid] < key){            // RIGHT (in case of Assending order)
                start = mid+1;
            }
            else{                               // LEFT (in case of Assending order)
                end = mid-1; 
            }
        }
        return -1;
    }


    public static void main(String args[]){
        int numbers[] = {1,2,3,4,5,6,7,8,22,33,55,101,11111,222222};
        int key = 4;

        int index = binary_Search (numbers ,key);
        System.out.println("Key found at index : "+ index );
    }
}