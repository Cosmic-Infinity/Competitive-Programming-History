//2ms 42.18mb

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stk.push(c);
                    break;
                case ')':
                    if (stk.isEmpty() || stk.pop() != '(') return false;
                    break;
                case '}':
                    if (stk.isEmpty() || stk.pop() != '{') return false;
                    break;
                case ']':
                    if (stk.isEmpty() || stk.pop() != '[') return false;
                    break;
            }
        }
        return stk.isEmpty();
    }
}