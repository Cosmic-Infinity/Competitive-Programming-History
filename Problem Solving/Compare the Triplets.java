//Prepare>Algorithms>Warmup>Compare the Triplets
//Java 8


import java.util.*;
public class Solution {
    public static void main(String[] args) {

        Scanner ob = new Scanner (System.in); 
        
        StringTokenizer st = new StringTokenizer(ob.nextLine(), " ");
        StringTokenizer st1 = new StringTokenizer(ob.nextLine(), " ");

        int a = 0, b = 0;
        
        for(int i=0;i<3;i++)
        {
            int ap = Integer.parseInt(st.nextToken());
            int bp = Integer.parseInt(st1.nextToken());
            if(ap > bp)
            a++;
            else if(bp > ap)
            b++;
        }
        
        System.out.println(a + " " + b);
        
        
        
        ob.close();
    }
}
