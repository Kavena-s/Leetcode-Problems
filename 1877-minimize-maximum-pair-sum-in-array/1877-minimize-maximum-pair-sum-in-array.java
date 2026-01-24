class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i , j=nums.length-1;
        int max = 0;
        for(i=0 ; i<nums.length/2 ; i++){
            max = Math.max(max,nums[i]+nums[j]);
            j--;
        }
        return max;
    }
}