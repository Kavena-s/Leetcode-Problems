class Solution {
    public int minPairSum(int[] nums) {
        int[] arr = new int[nums.length/2];
        Arrays.sort(nums);
        int i , j=nums.length-1;
        int max = 0;
        for(i=0 ; i<nums.length/2 ; i++){
            arr[i] = nums[i] + nums[j];
            max = Math.max(max,arr[i]);
            j--;
        }
        return max;
    }
}