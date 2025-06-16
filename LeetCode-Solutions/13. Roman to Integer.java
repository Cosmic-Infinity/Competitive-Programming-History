//2ms 45.05mb


class Solution {
    public int romanToInt(String s) {
        char c[] = s.toCharArray();

        short before = 0;
        short count = 0;
        int num = 0;

        for(int i = c.length-1; i>-1; i--){
            before = count;

            switch(c[i]){
                case 'I': count=1;
                break;
                case 'V': count=5;
                break;
                case 'X': count=10;
                break;
                case 'L': count=50;
                break;
                case 'C': count=100;
                break;
                case 'D': count=500;
                break;
                case 'M': count=1000;
                break;
            }
            if(before <= count){
                num = num+count;
            }
            else if(before> count){
                num = num-count;
            }
        }
        return num;
    }
}