package String;

public class Check_Palindrome {

    public static boolean pal(String str){
        for (int i=0 ; i<str.length()/2 ; i++){
            int n = str.length();
            if ( str.charAt(i) != str.charAt( n-i-1 )){
                System.out.println("Not a Palindrome");
                return false;
            }
            // else if (str.charAt(i) += str.charAt( n-i-1 )){
            //     System.out.println("It is a just a Palindrome");
            // }
        }
        return true;
    }

    public static void main (String args[]) {
        String str = "SupuS";
        System.out.println(pal(str));
    }
    
}
