//1ms 41.74mb


import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            res.add(new ArrayList<>());
            res.get(i).add(1);
            for (int j = 1; j < i; j++) {
                res.get(i).add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
            }
            res.get(i).add(1);
        }
        return res;
    }
}