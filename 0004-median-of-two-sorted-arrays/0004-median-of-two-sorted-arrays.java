class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3[] = new int[nums1.length+nums2.length];
        System.arraycopy(nums1,0,nums3,0,nums1.length);
        System.arraycopy(nums2,0,nums3,nums1.length,nums2.length);
        Arrays.sort(nums3);
        int len = nums3.length;
        double median;
        if(len%2 == 1){
           return nums3[len/2];
        }
        else{
            return (nums3[len/2]+nums3[(len/2)-1])/2.0;
        }
    }
}