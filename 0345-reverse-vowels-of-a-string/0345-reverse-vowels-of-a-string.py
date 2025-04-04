class Solution(object):
    def reverseVowels(self, s):
        index = []
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                index.append(s[i])
        index.reverse()
        s = list(s)
        j=0
        for i in range(len(s)):
            if s[i] in "aeiouAEIOU":
                s[i] = index[j]
                j+=1
        return "".join(s)
        