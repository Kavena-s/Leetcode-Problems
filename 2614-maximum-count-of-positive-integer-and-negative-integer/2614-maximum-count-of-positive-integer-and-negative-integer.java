class Solution {
    public int maximumCount(int[] nums) {
        int positive = 0;
        int negative = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i] < 0) negative += 1;
            else if(nums[i] > 0) positive += 1;
        }
        return Math.max(positive,negative);
    }
}