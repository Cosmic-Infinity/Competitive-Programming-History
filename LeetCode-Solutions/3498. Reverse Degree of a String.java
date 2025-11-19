//1ms 42.65mb

class Solution {
    public static int reverseDegree(String s) {
        int p = 0, len = s.length();
        for (int i=0; i<len; i++) {
            p += ((123 - s.charAt(i))* (i+1));
        }
        return p;
    }
}