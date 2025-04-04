class Solution(object):
    def reverseWords(self, s):
        temp = s.split()
        temp.reverse()
        a = ' '.join(temp)
        return a