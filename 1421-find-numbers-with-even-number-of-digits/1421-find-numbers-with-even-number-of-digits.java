class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0 ; i<nums.length ; i++){
            int val = nums[i];
            int temp = 0;
            while(val > 0){
                temp += 1;
                val /= 10;
            }
            if(temp%2 == 0)
                count += 1;
        }
        return count;
    }
}