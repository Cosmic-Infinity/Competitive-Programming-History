//Prepare>Java>Introduction>Java Static Initializer Block
//Java 8

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob = new Scanner(System.in);
        int b = ob.nextInt();
        int h = ob.nextInt();
        
        if(b<=0 || h<=0)
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        else
        System.out.println(h*b);
    }
}
