class Solution {
    public int semiOrderedPermutation(int[] nums) {
        if(nums[0] == 1 && nums[nums.length-1] == nums.length)return 0;
        int count = 0;
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums.length){
                int temp = nums[i+1];
                nums[i+1] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
        if(nums[0] == 1 && nums[nums.length-1] == nums.length)return count;
        for(int i=nums.length-1 ; i>0 ; i--){
           if(nums[i] == 1){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                count++;
            } 
        }
        return count;
    }
}