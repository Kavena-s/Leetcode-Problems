class Solution {
    public int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0 ; i<nums.length - 2 ; i++){
            for(int j=i+1 ; j<nums.length - 1 ; j++){
                for(int k=j+1 ; k<nums.length ; k++){
                    if(nums[i] < nums[j] && nums[j] > nums[k]){
                        if(min > nums[i]+nums[j]+nums[k]) min = nums[i]+nums[j]+nums[k];
                    }
                }
            }
        }
        if(min == Integer.MAX_VALUE) return -1;
        return min;
    }
}