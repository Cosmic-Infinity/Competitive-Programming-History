//1ms 41.54mb

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1 = word1.length(), l2 = word2.length();
        int x = 0, y = 0;
        StringBuilder s3 = new StringBuilder(l1 + l2);
        while (x < l1 && y < l2) {
            s3.append(word1.charAt(x++));
            s3.append(word2.charAt(y++));
        }
        while (x < l1)
            s3.append(word1.charAt(x++));
        while (y < l2)
            s3.append(word2.charAt(y++));

        return s3.toString();
    }
}