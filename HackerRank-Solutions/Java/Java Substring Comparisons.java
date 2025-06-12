//Prepare>Java>Strings>Java Substring Comparisons
//Java 8

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        smallest = largest = s.substring(0,k);
        
        for(int i = 0; i<s.length()-k+1; i++){
            String s1 = s.substring(i, i+k);
            smallest = s1.compareTo(smallest)<0? s1 : smallest;
            largest = s1.compareTo(largest)>0? s1 : largest;
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}