class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0 ; i<nums1.length ; i++){
            int j;
            for(j=0 ; j<nums2.length ; j++){
                if(nums1[i] == nums2[j])break;
            }
            int temp = -1;
            for(int k=j+1 ; k<nums2.length ; k++){
                if(nums2[j] < nums2[k]){
                    temp = nums2[k];
                    break;
                }
            }
            ans[i] = temp;
        }
        return ans;
    }
}