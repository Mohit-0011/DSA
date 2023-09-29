
package String;

// import.util.*;
public class Shortest_Path {
    public static float srt_path (String path){
        int x = 0; int y =0;
        for (int i = 0; i< path.length(); i++){
            char dir = path.charAt(i);

            //North
            if ( dir == 'N'){
                y++;
            }    
            //South
            else if ( dir == 'S'){
                y--;
            }
            //East
            else if ( dir == 'E'){
                x++;
            }
            //West
            else if (dir == 'W'){
                x--;}
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(y2+x2);

    }
    public static void main (String args[]){
        String path = "NE";
        System.out.print("Displacement " + srt_path(path));
        }
}
