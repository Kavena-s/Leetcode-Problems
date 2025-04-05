class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int tot = 0;
        for(int i=0 ; i<nums.length ; i++){
            int count = 0;
            if(i-k < nums.length && i-k > -1){
                if(nums[i] > nums[i-k])
                    count += 1;
            }
            else
                count +=1 ;
            if(i+k < nums.length && i+k > -1){
                if(nums[i] > nums[i+k])
                    count += 1;
            }
            else
                count += 1;
            if(count == 2) tot += nums[i];
        }
        return tot;
    }
}