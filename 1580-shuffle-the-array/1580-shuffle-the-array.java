class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr1 = new int[nums.length/2];
        int[] arr2 = new int[nums.length/2];
        for(int i=0 ; i<nums.length/2 ; i++){
            arr1[i] = nums[i];
        }
        int temp = 0;
        for(int i=nums.length/2 ; i<nums.length ; i++){
            arr2[temp++] = nums[i];
        }
        temp = 0;
        for(int i=0 ; i<arr1.length ; i++){
            nums[temp++] = arr1[i];
            nums[temp++] = arr2[i];
        }
        return nums;
    }
}