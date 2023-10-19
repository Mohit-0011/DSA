package Recursion;

public class Friend_Pairing_Problem {
    public static int friends_pairing(int n){
        //BaseCase
        if (n==1 || n==2){
            return n;
        }
        //Choice
        //Single
        int fnm1 = friends_pairing(n-1);

        //Pair
        int fnm2 = friends_pairing(n-2);
        int pairWays = (n-1) * fnm2;

        //Total Ways 
        int totways = fnm1 + pairWays;
        return totways;
    }
    public static void main(String args[]){
        System.out.println(friends_pairing(3));
    }
}
