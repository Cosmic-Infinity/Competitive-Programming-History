//Prepare>Java>Strings>Java Strings Introduction
//Java 8

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        System.out.println(A.compareTo(B)<=0?"No":"Yes");
        System.out.println((A.charAt(0)+"").toUpperCase()+A.substring(1,A.length())+" "+(B.charAt(0)+"").toUpperCase()+B.substring(1,B.length()));
    }
}



