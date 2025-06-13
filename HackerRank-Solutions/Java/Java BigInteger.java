//Prepare>Java>BigNumber>Java BigInteger
//Java 8

//import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob = new Scanner(System.in);
        BigInteger a = new BigInteger(ob.next());
        BigInteger b = new BigInteger(ob.next());
        ob.close();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
