public class Trapping_Rainwater_Problem {
    public static int trappedRainwater (int height[]){

        //Left Max Boundary - Array
        int left_max_boundary[] = new int [height.length];
        left_max_boundary[0] = height[0];       //Initializing the left_max_boundary as 0
        
        for (int i=1 ; i<height.length ; i++){
            left_max_boundary[i] = Math.max(height[i], left_max_boundary[i-1]);     //Comparing the Current height to the max height and then storing greater value into the left_max_boundary
        }           
                        
        //Right Max Boundary - Array
        int right_max_boundary[] = new int [height.length];
        right_max_boundary[height.length-1] = height[height.length-1];          // Inorder to start right_max_boundary from the last index we use height.length-1 
        for(int i = height.length-2 ; i>=0 ; i--){
            right_max_boundary[i] = Math.max(height[i], right_max_boundary [i+1] );
        }


        int trapped_water =0;
        //loop
        for(int i=0 ; i<height.length ; i++){
            int water_level = Math.min(right_max_boundary[i], left_max_boundary[i]); 
            trapped_water += water_level - height[i];      //+ is impt so that the amount of trapped water could get added all together
        }

        return trapped_water;

        //waterLevel = min(left_max_boundary , right_max_boundary)
        //trapped_water = water_level - height
    }
    public static void main (String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}