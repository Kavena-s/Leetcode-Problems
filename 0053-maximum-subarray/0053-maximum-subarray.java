class Solution {
    public int maxSubArray(int[] nums) {
        int current_max = nums[0];
        int tot_max = nums[0];
        for(int i = 1; i<nums.length ; i++){
            current_max = Math.max(current_max+nums[i],nums[i]);
            tot_max = Math.max(current_max,tot_max);
        }
        return tot_max;
    }
}