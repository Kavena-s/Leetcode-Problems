class Solution(object):
    def addToArrayForm(self, num, k):
        ans = int("".join(map(str, num)))  
        add = ans + k                      
        res = [int(d) for d in str(add)]   
        return res
