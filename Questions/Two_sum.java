//BruteForce
class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i< nums.length ; i++){
            for (int j = 1; j< nums.length ; j++){
                if (nums [i] + nums[j] == target){
                    int a[] = {i, j};
                    return a ;
                }
            }
            
        }
    return null;
    }
}
//BruteForce
    // Using Two Pointers i and j such that : Starting from index 0 pointer i moves upto n-1 where as stating form 1 pointer j moves to n i.e. i+1 

    // Then at every iteration we can take sum of both the pointers and compare it to the target

    //for i=0 to n-1
    //for j=i+1 to n -1
    //if (target==nums[i] + nums[j])



//----------Optimized HashMap Approach------------

// class Solution {
//     public int[] twoSum(int[] nums, int target) {


//         HashMap<Integer , Integer> map = new HashMap();

//     //Fill HashMap
//     for (int i=0 ; i < nums.length ; i++){
//         map.put(nums[i], i );
//     }
//     //Searching 
//     for (int i =0 ; i < nums.length ; i++){ //2 7 11 15 
//     int num = nums[i];      //2
//     int rem = target - num;     //7

//     if (map.containsKey(rem)){
//         int index = map.get(rem);

//         if (index == i) continue;   //It is to make sure one number does not gets repeated twice
        
//         return new int []{i , index};
//             }
//         }
//         return new int []{};
//     }
// }


//Optimized Technique 
    //Using HashMap
        //Hashmap stores all the numbers with respective index numbers
    // Starting form the first number and subtract it from the target and then check if that number is available in the array

