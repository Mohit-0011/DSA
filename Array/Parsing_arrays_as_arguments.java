// import java.util.*; 
// To add 1 to every element of the array

public class Parsing_arrays_as_arguments{
    public static void update(int marks[]){
        for( int i = 0 ;i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks [] = {27,98,99};
        update(marks);

        // To Print Marks
        for( int i = 0 ;i<marks.length; i++){
            System.out.println(marks[i]);
    }
    System.out.println();
}
}