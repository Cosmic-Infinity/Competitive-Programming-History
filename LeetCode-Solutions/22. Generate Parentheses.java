//0ms 42.97mb

import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        generate(res, new StringBuilder(), n, n);
        return res;
    }

    void generate(List<String> res, StringBuilder s, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(s.toString());
            return;
        }
        // note to self. we can use string builder here to speed up concatenations, but that would require us to backtrack(remove the last char.) after each call, since the stringbuilder will be a mutable object (think like passing an int[] instead of int.). each time we call append, the object is modified permanently and the funcation return doesn't restore the stringbuilder to it's original state (which is why a manual intervention with s.deleteCharAt(s.length()-1) will be required in it's case.)
        //this isn't a problem with strings, because string objects are immutable (and use auto-constructor to remove any link between the previous and newly created string when we do s+"(" or s+")") so the previous state of the string is preserved in the call stack along with other primitives like the int left and int right. 
        if (left > 0) {
            generate(res, s.append("("), left - 1, right);
            s.deleteCharAt(s.length() - 1);
        }
        if (right > left) {
            generate(res, s.append(")"), left, right - 1);
            s.deleteCharAt(s.length() - 1);
        }
    }
}