import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob = new Scanner(System.in);
        int dr = ob.nextInt();
        int mr = ob.nextInt();
        int yr = ob.nextInt();
        
        int dd = ob.nextInt();
        int md = ob.nextInt();
        int yd = ob.nextInt();
        ob.close();
                
        int fine = 0;
        if(yr==yd){
            if(mr>md)
                fine = 500 * (mr-md);
            else if(dr>dd)
                fine = 15 * (dr-dd);
            else
                fine = 0; 
        }
        else if(yr < yd){
            fine = 0;
        }
        else{
              fine = 10000;
        }
        System.out.println(fine);

    }
}