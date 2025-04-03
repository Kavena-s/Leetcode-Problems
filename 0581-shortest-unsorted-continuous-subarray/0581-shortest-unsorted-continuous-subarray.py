class Solution(object):
    def findUnsortedSubarray(self, nums):
        arr=sorted(nums)
        first,last=-1,-1
        for i in range (len(nums)):
            if nums[i] != arr[i]:
                first = i
                break
        for i in range(len(nums)-1,0,-1):
            if nums[i] != arr[i]:
                last=i
                break
        return last-first+1 if first!=-1 and last!=-1 else 0

        