class Solution {
    public int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        int n = nums.length;
        if(nums[0] <= nums[right])
            return nums[0];
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] > nums[n-1])
                left = mid + 1;
            else right = mid - 1;
        }
        return nums[left];
    }
}