//1ms 42.54mb

class Solution {
    public String[] divideString(String s, int k, char fill) {
        String[] res = new String[(int) Math.ceil((double) s.length() / k)];
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        int x = 0;
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if (i % k == 0) {
                res[x++] = sb.toString();
                sb.setLength(0);
                sb.append(s.charAt(i));
            } else
                sb.append(s.charAt(i));
        }
        if (sb.length() > 0) {
            for (int i = sb.length(); i < k; i++) {
                sb.append(fill);
            }
            res[x] = sb.toString();
        }
        return res;
    }
}