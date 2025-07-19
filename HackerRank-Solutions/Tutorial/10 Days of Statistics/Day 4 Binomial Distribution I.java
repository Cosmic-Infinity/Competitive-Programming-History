import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        //n=6, x=3,4,5,6 , p=boyratio
        double boyratio = 109f/(100+109);
        double sum =0;
        for(int i=3; i<7; i++){
            double comb = (double)fact(6)/(fact(i)*fact(6-i));
            double res = comb * Math.pow(boyratio,i) * Math.pow(1- boyratio, 6-i);
            sum += res;
        }
        
        System.out.format("%.3f", sum);
    }
    
    private static int fact(int n){
        if (n<2) return 1;
        return n * fact(n-1);
    }
}