//Prepare>Java>Strings>Java String Reverse
//Java 8


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb = new StringBuilder(A);
        System.out.println(A.equals(sb.reverse().toString())?"Yes":"No");
        /* Enter your code here. Print output to STDOUT. */
        
    }
}



