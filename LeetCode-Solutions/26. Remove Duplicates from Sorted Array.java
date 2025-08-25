//0ms 44.53mb

class Solution {
    public int removeDuplicates(int[] nums) {
        int initial = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[initial] != nums[i]) {
                nums[++initial] = nums[i];
            }
        }
        return initial + 1;
    }
}