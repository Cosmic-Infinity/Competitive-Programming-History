//4ms 57.76mb

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0, right = (height.length-1);
            while(left<right){
                int t = Math.min(height[left], height[right])*(right-left);
                if(t>max){
                    max=t;
                }
                if(height[left]<height[right])
                    left++;
                else
                    right--;
            }
        return max;
    }
}