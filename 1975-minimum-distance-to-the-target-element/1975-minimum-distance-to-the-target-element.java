class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length; i++){
            if(nums[i] == target && min > Math.abs(i - start)){
                min = Math.abs(i - start);
            }
        }
        return min;
    }
}