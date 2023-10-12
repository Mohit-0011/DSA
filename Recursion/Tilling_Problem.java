package Recursion;

public class Tilling_Problem {
    public static int tillingProblem(int n){            // 2 * n (floor size) we have to find the value of n
        //Base Case
        if(n==0 || n==1){
            return 1;
        }

        // Choice (Either to with vertical or horizontal layout for the tiles)

        //Vertical Choice 
        int fnm1 = tillingProblem(n-1);

        //Horizontal choice
        int fnm2 = tillingProblem(n-2);

        //Total Number of Choices: 
        int totWays = fnm1 + fnm2;

        return totWays;

    }
    public static void main (String args[]){
        System.out.println(tillingProblem(4));
    }
}
//  The Code is valid also for 4 * n with tile size 4 * 1 