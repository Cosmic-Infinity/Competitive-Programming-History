//9ms 42.7mb

class Solution {
    public boolean isPalindrome(int x) {
        //BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       int rev =0;

       for(int i=x;i>0;i=i/10)
           rev=(rev*10)+(i%10);

           return(rev==x);
    }
}