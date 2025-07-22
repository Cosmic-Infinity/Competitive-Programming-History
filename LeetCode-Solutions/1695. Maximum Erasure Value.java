//50ms 61.12mb


class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        int sum = 0, max = 0, left = 0;
        for (int right = 0; right < nums.length;) {
            if (!set.contains(nums[right])) {
                set.add(nums[right]);
                sum += nums[right++];
                if (sum > max)
                    max = sum;
            } else {
                set.remove(nums[left]);
                sum -= nums[left++];
            }
        }
        return max;
    }
}