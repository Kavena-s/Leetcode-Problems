class Solution(object):
    def majorityElement(self, nums):
        nums.sort()
        maj=len(nums)/2
        return nums[maj]

        