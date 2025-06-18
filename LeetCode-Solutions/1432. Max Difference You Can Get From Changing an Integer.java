// 1ms 40.50mb

class Solution {
    public int maxDiff(int num) {
        String s = num + "";
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c != '9') {
                s = s.replace(c, '9');
                break;
            }
        }
        int max = Integer.parseInt(s);
        
        s = num + "";
        if (s.charAt(0) > '1')
            s = s.replace(s.charAt(0), '1');
        else {
            for (int i = 0; i < len; i++) {
                char c = s.charAt(i);
                if (c > '0' && c != s.charAt(0)) {
                    s = s.replace(s.charAt(i), '0');
                    break;
                }
            }
        }

        int min = Integer.parseInt(s);
        return Math.abs(max - min);
    }
}