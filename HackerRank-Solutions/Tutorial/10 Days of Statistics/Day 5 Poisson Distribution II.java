import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        float lmbd1 = 0.88f;
        float lmbd2 = 1.55f;
        int k = 1;
        
        double res1 = lmbd1+lmbd1*lmbd1;
        double ca = 160+(40*res1);
        double res2 = lmbd2+lmbd2*lmbd2;
        double cb= 128+(40*res2);
        System.out.format("%.3f\n%.3f", ca, cb);
    }
    
    private static int fact(int n){
        if (n<2) return 1;
        return n * fact(n-1);
    }
}
