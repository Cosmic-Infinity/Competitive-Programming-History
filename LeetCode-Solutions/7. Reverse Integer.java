//1ms 39.5mb

class Solution {
    public int reverse(int x) {
        byte f = 1;
        if(x<0){
            f = -1;
        }
        
        long output=0l;
        for(long i = Math.abs(x); i>0; i=i/10){
            output = output*10 + (i%10);
        }

        try{
            return(Math.toIntExact(output*f));
        }catch(ArithmeticException e){
            return 0;
        }
    }
}