import java.util.*; 

public class Array_Scanner_Class_percentage{
    public static void main(String args[]){
        int marks[] = new int [111];                   // [] is used to create a array            //  new int [100] is used to specify the storage inside the array                                                        
    

        Scanner sc = new Scanner(System.in);                           // Scanner sc is the new scanner class            // System.in is used to specify taking input                                     
    
        marks[0] = sc.nextInt();                                        // marks[0] is used to direct that the input would be stored inside the 0 index of the array                                           
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        System.out.println("English :" + marks[0]);
        System.out.println("Hindi :" + marks[1]);
        System.out.println("Maths :" + marks[2]);
        System.out.println("Science :" + marks[3]);
  
        int percentage = (marks[0] + marks[1] + marks[2] + marks[3])/4;

      sc.close();
      System.out.println("Percentage =" +percentage + "%");
      System.out.println("Length of the array :"+ marks.length);
    }
}