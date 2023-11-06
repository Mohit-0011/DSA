class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap();

    //Fill HashMap
    for (int i=0 ; i < nums.length ; i++){
        map.put(nums[i], i );
    }
    //Searching 
    for (int i =0 ; i < nums.length ; i++){ //2 7 11 15 
    int num = nums[i];      //2
    int rem = target - num;     //7

    if (map.containsKey(rem)){
        int index = map.get(rem);

        if (index == i) continue;   //It is to make sure one number does not gets repeated twice
        
        return new int []{i , index};
            }
        }
        return new int []{};
    }
}

// Starting form the first number and subtract it from the target and then check if that number is available in the array


//BruteForce
    //for i=0 to n-1
    //for j=i+1 to n -1
    //if (target==nums[i] + nums[j])

//Optimized Technique 
    //Using HashMap
        //Hashmap stores all the numbers with respective index numbers