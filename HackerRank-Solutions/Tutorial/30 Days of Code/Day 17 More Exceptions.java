import java.util.*;
import java.io.*;

//Write your code here

class Calculator{
    int power(int num, int pow) throws NonNeg{
        if(num<0 || pow<0) throw new NonNeg("n and p should be non-negative");
        return (int)Math.pow(num, pow);
    }
}

class NonNeg extends Exception{
    NonNeg(String s){
        super(s);
    }
}

class Solution{

    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
        
            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
