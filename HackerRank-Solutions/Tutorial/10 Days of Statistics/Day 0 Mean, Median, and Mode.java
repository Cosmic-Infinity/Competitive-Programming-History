import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob =new Scanner(System.in);
        int n = ob.nextInt();
        int[] a = new int[n];
        for(int i=0;i <n; i++){
            a[i]=ob.nextInt();
        }
        ob.close();
        int sum=0;
        int count = 1;
        int max_count = 1;
        Arrays.sort(a);
        int mode=a[0];
        for(int i=0; i<n-1; i++){
            sum+=a[i];
            if(a[i]==a[i+1])
                count++;
            else{
                if(count>max_count){
                    max_count = count;
                    mode = a[i];
                }
                count=1;
            }
        }
        sum+=a[n-1];
        float mean = sum/(float)n;
        float median = 0;
        if(n%2==1){
            median = a[n/2];
        }
        else{
            median = (a[n/2 - 1] + a[n/2])/2f;
        }
        System.out.println(mean+"\n"+median+"\n"+mode);
    }
}
