import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob  = new Scanner(System.in);
        int n = ob.nextInt();
        int a[] = new int[n];
        for(int i=0; i<n; i++){
            a[i] = ob.nextInt();
        }
        ob.close();
        for(int i=0; i<n; i++){
            if(a[i]<2){
                System.out.println("Not prime");
                continue;
            }
            int num = (int)Math.sqrt(a[i]);
            int count = 0;
            for(int j=2; j<=num; j++){
                if(a[i]%j == 0)
                    count++;
                if(count > 0) break;
            }
            if(count==0) System.out.println("Prime");
            else System.out.println("Not prime");
        }
    }
}
