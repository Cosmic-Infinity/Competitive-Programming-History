//0ms 40.20mb

class Solution {
    public static int climbStairs(int n) {
        int fn = 0, sn=1, add=0;
        for(int i=0; i<n; i++){
            add = fn+sn;
            fn = sn;    
            sn = add;        
        }

        return add;
    }
}