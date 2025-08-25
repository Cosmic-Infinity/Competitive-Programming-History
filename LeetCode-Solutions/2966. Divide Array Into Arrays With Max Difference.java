//23ms 59.38mb

import java.util.*;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res[][] = new int[nums.length / 3][3];
        for (int i = 0, j = 0; i < nums.length; i += 3, j++) {
            if (nums[i + 1] - nums[i] <= k && nums[i + 2] - nums[i + 2] <= k && nums[i + 2] - nums[i] <= k){
                res[j][0] = nums[i];
                res[j][1] = nums[i + 1];
                res[j][2] = nums[i + 2];
            } else
                return new int[0][0];
        }
        return res;
    }
}