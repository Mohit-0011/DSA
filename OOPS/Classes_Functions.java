package OOPS;

public class Classes_Functions {
    public static void main (String args[] ){
        Pen p1 = new Pen(); //Creating the object p1 with the attributes of Pen
        
        p1.SetColor("blue");
        System.out.println(p1.color);

        p1.tip(5);
        System.out.println(p1.tip);
        p1.tip = 2;
        System.out.println(p1.tip);
 
    }     
}
class Pen {
    //Properties
    String color ;
    int tip;
    
     
    void SetColor (String newColor){
        color = newColor;
    } 
    void tip (int newTip){
        tip = newTip;
    }
    //Functions
}
class Student{
    String name ; 
    int age;
    float percentage;
    
    void calPercentage( int phy, int maths , int chem){
        percentage = (phy+maths+chem)/3;
    }
}

