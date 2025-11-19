//55ms 45.55ms


class Solution {
    public int maximumGain(String s, int x, int y) {
        int score = 0;
        char first, second;
        int high, low;

        if (x > y) {
            first = 'a';
            second = 'b';
            high = x;
            low = y;
        } else {
            first = 'b';
            second = 'a';
            high = y;
            low = x;
        }

        //higher-scoring pair
        int len = 0, len2 = 0;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            len = sb.length();
            len2 = len - 1;
            if (len > 0 && sb.charAt(len2) == first && c == second) {
                sb.deleteCharAt(len2);
                score += high;
            } else {
                sb.append(c);
            }
        }

        //lower-scoring pair
        StringBuilder rest = new StringBuilder();
        for (char c : sb.toString().toCharArray()) {
            len = rest.length();
            len2 = len - 1;
            if (len > 0 && rest.charAt(len2) == second && c == first) {
                rest.deleteCharAt(len2);
                score += low;
            } else {
                rest.append(c);
            }
        }

        return score;
        // //StringBuilder s = new StringBuilder(s);
        // int score = 0;
        // int n = -1, len = 0, len2 = 0;
        // if (y > x) {
        //     while ((n = s.indexOf("ba")) > -1) {
        //         len = s.length();
        //         s = s.replaceAll("ba", "");
        //         len2 = s.length();
        //         score += y * ((len - len2) / 2);
        //     }
        //     while ((n = s.indexOf("ab")) > -1) {
        //         len = s.length();
        //         s = s.replaceAll("ab", "");
        //         len2 = s.length();
        //         score += x * ((len - len2) / 2);
        //     }
        // } else {
        //     while ((n = s.indexOf("ab")) > -1) {
        //         len = s.length();
        //         s = s.replaceAll("ab", "");
        //         len2 = s.length();
        //         score += x * ((len - len2) / 2);
        //     }
        //     while ((n = s.indexOf("ba")) > -1) {
        //         len = s.length();
        //         s = s.replace("ba", "");
        //         len2 = s.length();
        //         score += y * ((len - len2) / 2);
        //     }
        // }
        // return score;
    }
}