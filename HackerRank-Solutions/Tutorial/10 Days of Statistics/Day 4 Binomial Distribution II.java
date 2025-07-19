import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        double reject = 12.0/100;
        double sum = 0;
        double res2 = 0;
        for(int i=0; i<3; i++){
            double comb = (double)fact(10)/(fact(i)*fact(10-i));
            double res = comb * Math.pow(reject,i) * Math.pow(1- reject, 10-i);
            if(i<2) res2 += res;
            sum += res;
        }
        
        System.out.format("%.3f\n%.3f", sum, 1-res2);
        
    }
    
    private static int fact(int n){
        if (n<2) return 1;
        return n * fact(n-1);
    }
}