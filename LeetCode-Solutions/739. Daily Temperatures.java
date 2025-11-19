//8ms 60.38mb

class Solution {
    public int[] dailyTemperatures(int[] tem) {
        int res[] = new int[tem.length];
        //Stack<Integer> s = new Stack<>(); //object stack using too much runtime
        int[] s = new int[tem.length]; //takes more memory though
        int current = -1;
        for (int i = tem.length - 1; i > -1; i--) {
            while (current != -1 && tem[i] >= tem[s[current]]) //peek and check
                current--; //pop
            if (current != -1)
                res[i] = s[current] - i; //peek and set
            s[++current] = i; //push
        }
        // for (int i = 0; i < tem.length; i++) { //brute force tle
        //     for (int j = i; j < tem.length; j++) {
        //         if (tem[j] > tem[i]) {
        //             res[i] = j - i;
        //             break;
        //         }
        //     }
        // }
        return res;
    }
}