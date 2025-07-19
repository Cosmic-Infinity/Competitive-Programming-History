import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        float lmbd = 2.5f;
        int k = 5;
        
        double res = (Math.pow(lmbd, k)*Math.pow(Math.E, -lmbd))/fact(k);
        System.out.format("%.3f", res);
    }
    
    private static int fact(int n){
        if (n<2) return 1;
        return n * fact(n-1);
    }
}