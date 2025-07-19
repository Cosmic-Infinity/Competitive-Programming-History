import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double p = 1.0/3;
        double q = 1-p;
        int x = 1;
        int n = 5;
        
        double res = c(n-1, x-1)*Math.pow(p,x)*Math.pow(q,n-x);
        System.out.format("%.3f",res);
    }
    
    private static double c(int n, int x){
        return(fact(n)/(fact(x)*fact(n-x)));
    }
    private static int fact(int n){
        if (n<2) return 1;
        return n * fact(n-1);
    }
}
