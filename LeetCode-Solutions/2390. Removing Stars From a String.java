//9ms 45.34mb


class Solution {
    public String removeStars(String s) {
        char[] c = s.toCharArray();
        int p1 = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '*') {
                p1--;
            } else {
                c[p1] = c[i];
                p1++;
            }
        }
        return new String(c, 0, p1);
        // Stack<Character> st = new Stack<Character>();
        // StringBuilder sb = new StringBuilder();
        // int len = s.length();
        // char c = '\0';
        // for (int i = 0; i < len; i++) {
        //     c = s.charAt(i);
        //     if (c == '*')
        //         st.pop();
        //     else
        //         st.push(c);
        // }
        // while (!st.isEmpty())
        //     sb.append(st.pop());
        // return sb.reverse().toString();
    }
}