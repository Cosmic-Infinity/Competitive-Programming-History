//Prepare>Java>Exception Handling>Java Exception Handling (Try-catch)
//Java 15




import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob = new Scanner (System.in);
        
        try{
            int x = ob.nextInt();
            int y = ob.nextInt();
            System.out.println(x/y);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }
        catch(Exception e){
            System.out.println(e);
        }
        ob.close();
    }
}
