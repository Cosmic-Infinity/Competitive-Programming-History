//17ms 57.25mb

import java.util.*;

class Solution {
    public int maxOperations(int[] nums, int k) {
        int count = 0;
        int lp = 0, hp = nums.length - 1;
        int sum;
        Arrays.sort(nums);
        while (lp < hp) {
            sum = nums[lp] + nums[hp];
            if (sum == k) {
                count++;
                lp++;
                hp--;

            } else if (sum < k)
                lp++;
            else
                hp--;

        }
        return count;
    }
}