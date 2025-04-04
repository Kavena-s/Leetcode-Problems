class Solution(object):
    def findDifference(self, nums1, nums2):
        nums1 = set(nums1)
        nums2 = set(nums2)   
        temp1 = list(nums1 - nums2)
        temp2 = list(nums2 - nums1)
        return [temp1,temp2]
