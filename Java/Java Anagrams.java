//Prepare>Java>Strings>Java Anagrams
//Java 8

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0; i<a.length(); i++){
            int pos = b.indexOf(a.charAt(i));
            if(pos==-1) return(false);
            else
            b=b.substring(0,pos)+b.substring(pos+1,b.length());
        }
        if(b.length()==0)
        return(true);
        else
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}



