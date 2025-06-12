//Prepare>Java>Introduction>Java End-of-file
//Java 8

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
   int n=1;
    while(ob.hasNextLine()){
        System.out.println(n+" "+ ob.nextLine());
         n++;
    }
    //ob.close();
    }
} 
