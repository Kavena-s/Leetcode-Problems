class Solution(object):
    def kidsWithCandies(self, candies, extraCandies):
        num = max(candies)
        for i in range(0,len(candies),1):
            if candies[i]+extraCandies >= num:
                candies[i]=True
            else:
                candies[i]=False
        return candies
            
        