class Solution(object):
    def maxProduct(self, word):
        max_product = 0
        words = []
        for i in range(len(word)):
            words.append(set(word[i])) 
        for i in range(len(words)):
            for j in range(i + 1, len(words)):
                if words[i].isdisjoint(words[j]):
                    max_product = max(max_product, len(word[i]) * len(word[j]))
        return max_product
