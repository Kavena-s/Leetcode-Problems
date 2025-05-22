class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<3) return nums[nums.length-1];
        int invalid = Integer.MIN_VALUE-2;
        for(int i= 0 ; i<nums.length-1 ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                if(nums[i] != invalid){
                    if(nums[i] == nums[j])
                        nums[j] = invalid;
                }
            }
        }
        int count = 0;
        int temp = 0;
        for(int i=nums.length - 1 ; i>=0 ; i--){
            if(nums[i] != invalid){
                count++;
                if(count == 1)
                    temp = nums[i];
                else if(count == 3)
                    return nums[i];
            }
        }
        return temp;
    }
}