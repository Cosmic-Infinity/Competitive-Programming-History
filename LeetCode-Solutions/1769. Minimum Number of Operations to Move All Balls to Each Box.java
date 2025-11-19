//73ms 44.79mb

class Solution {
    public int[] minOperations(String boxes) {
        int len = boxes.length(), count;
        char[] chars = boxes.toCharArray();
        int res[] = new int[len];
        for (char i = 0; i < len; i++) {
            count = 0;
            for (int j = 0; j < len; j++) {
                if (chars[j] == '1') {
                    count += Math.abs(i - j);
                }
            }
            res[i] = count;
        }
        return res;
    }
}