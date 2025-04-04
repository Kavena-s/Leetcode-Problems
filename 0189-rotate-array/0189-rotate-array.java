class Solution {
    public void rotate(int[] nums, int k) {
        k = k % (nums.length);
        int nums1[] = Arrays.copyOfRange(nums, 0 , nums.length-k);
        int nums2[] = Arrays.copyOfRange(nums, nums.length-k , nums.length);
        System.arraycopy(nums2,0,nums,0,nums2.length);
        System.arraycopy(nums1,0,nums,nums2.length,nums1.length);
        System.out.print(nums);
    }
}