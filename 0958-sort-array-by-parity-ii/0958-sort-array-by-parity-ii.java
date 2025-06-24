class Solution {
    public int[] sortArrayByParityII(int[] nums) {
      int[] arr1 = new int[nums.length/2];
      int[] arr2 = new int[nums.length/2];
      int t1 = 0;
      int t2 = 0;
      for(int i=0 ; i<nums.length ; i++){
        if(nums[i]%2 == 0)arr1[t1++] = nums[i];
        else arr2[t2++] = nums[i];
      }
      Arrays.sort(arr1);
      Arrays.sort(arr2);
      int t = 0;
      for(int i=0 ; i<arr1.length ; i++){
        nums[t++] = arr1[i];
        nums[t++] = arr2[i];
      }
    return nums;
    }
}