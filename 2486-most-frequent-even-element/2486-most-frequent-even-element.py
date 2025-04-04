class Solution(object):
    def mostFrequentEven(self, nums):
        i=0
        while i < len(nums):
            if nums[i]%2 != 0:
                nums.pop(i)
            else:
                i=i+1
        count = {}
        for num in nums:
            if num in count:
                count[num] += 1
            else:
                count[num] = 1
        max_count = -1
        result = -1
        for nums,num in count.items():
            if max_count < num or (num == max_count and nums<result):
                max_count = num
                result = nums
        return result