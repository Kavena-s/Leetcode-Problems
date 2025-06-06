class Solution {
    public int minElement(int[] nums) {
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            int min = 0;
            while(num > 0){
                int a = num % 10;
                min= min + a;
                num = num/10;
            }
            nums[i] = min;
        }
        Arrays.sort(nums);
        return nums[0];
    }
}