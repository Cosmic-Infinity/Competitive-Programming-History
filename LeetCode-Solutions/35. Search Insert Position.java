//0ms 42.78mb

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length;
        int mid = 0;
        while(l<r){
            mid = (l+r)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) r = mid;
            else l = mid+1;
        }
        return r;
    }
}