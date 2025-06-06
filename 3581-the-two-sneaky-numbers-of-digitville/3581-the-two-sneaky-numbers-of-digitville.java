class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        int temp = 0;
        Arrays.sort(nums);
        for(int i=0 ; i<nums.length-1 ; i++){
            if(nums[i] == nums[i+1]) arr[temp++] = nums[i];
        }
        return arr;
    }
}