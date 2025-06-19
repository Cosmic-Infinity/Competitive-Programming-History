//30ms 57.0mb

import java.util.Arrays;
class Solution {
    public int partitionArray(int[] nums, int k) {
        int subseq = 1;
        int indx = 0;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] - nums[indx] > k){
                indx = i;
                subseq++;
            }
        }
        return subseq;
    }
}