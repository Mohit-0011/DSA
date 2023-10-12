package Recursion;

public class Remove_Duplicates_in_a_String {
    public static void removeDuplicates(String str , int idx , StringBuilder newString , boolean map[]){

        //Base Case
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }
        //Checking if the character is a duplicate or not by checking and assigning true to the characters in the map array and skipping the character if it arrives again

        char currChar = str.charAt(idx);

        if( map[currChar-'a'] == true ){
            //If the value is already true then the char is a duplicate
            removeDuplicates(str, idx + 1, newString, map);

        } else {

            map[currChar - 'a' ] = true; 
            removeDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }   
    public static void main (String args[]){

        String str = "apnacollegeisthebest";
        removeDuplicates(str,0,new StringBuilder(""), new boolean[26]);
    }
}
