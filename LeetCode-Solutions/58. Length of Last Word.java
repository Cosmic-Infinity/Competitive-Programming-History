//0ms 41.43mb

class Solution {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == ' ')
                return count;
            else
                count++;
        }
        return s.length();
    }
}