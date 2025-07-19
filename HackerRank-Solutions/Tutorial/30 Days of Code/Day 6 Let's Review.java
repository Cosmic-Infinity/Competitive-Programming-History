import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();
        ob.nextLine();
        for(int i=0; i<t; i++){
            String s = ob.nextLine();
            int len = s.length();
            for(int j=0; j<len; j++){
                if(j%2==0) System.out.print(s.charAt(j));
            }
            System.out.print(" ");
            for(int j=0; j<len; j++){
                if(j%2==1) System.out.print(s.charAt(j));
            }
            System.out.println();
        }
        ob.close();
    }
}