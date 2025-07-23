//4ms 42.73mb

import java.util.*;

class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        boolean weird = false;
        boolean positive = true;
        if (s.length() < 1)
            return 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i == 0 && (c == '+' || c == '-'))
                positive = c == '-' ? false : true;
            else {
                if (Character.isDigit(c))
                    sb.append(c);
                else {
                    weird = true;
                    break;
                }
            }
        }

        int num = 0;
        if (sb.length() > 0 && sb.charAt(0) == '0' && !weird) {
            try {
                do {
                    sb.delete(0, 1);
                } while (sb.charAt(0) == '0');
            } catch (Exception e) {
            }
        }
        if (sb.length() > 10) {
            if (Character.isDigit(sb.charAt(0)) && positive)
                return Integer.MAX_VALUE;
            else if (Character.isDigit(sb.charAt(0)) && !positive)
                return Integer.MIN_VALUE;
        } else {
            try {
                sb.insert(0, positive ? '+' : '-');
                num = Integer.parseInt(sb.toString());
                //num *= positive ? 1 : -1;
            } catch (Exception e) {
                try {
                    if (Long.parseLong(sb.toString()) > 0)
                        return Integer.MAX_VALUE;
                    else
                        return Integer.MIN_VALUE;
                } catch (Exception f) {
                    return 0;
                }
            }
        }
        return num;
    }
}