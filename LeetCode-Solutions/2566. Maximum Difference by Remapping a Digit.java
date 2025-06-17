//1ms 40.95mb

class Solution {
    public int minMaxDifference(int num) {
        String s = num+"";
        int len = s.length();
        for(int i=0; i<len; i++){
            if(s.charAt(i)!='9'){
                s = s.replace(s.charAt(i),'9');
                break;
            }
        }
        int max = Integer.parseInt(s);
        s = num+"";
        for(int i=0; i<len; i++){
            if(s.charAt(i)!='0'){
                s = s.replace(s.charAt(i),'0');
                break;
            }
        }
        int min = Integer.parseInt(s);
        return Math.abs(max-min);
    }
}