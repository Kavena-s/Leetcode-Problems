class Solution(object):
    def getHint(self, secret, guess):
        Bulls = 0
        Cows = 0
        secretcount = [0] * 10
        guesscount = [0] * 10
        for i in range (len(secret)):
            s = secret[i]
            g = guess[i]
            if(s == g):
                Bulls += 1
            else:
                secretcount[int(s)] += 1
                guesscount[int(g)] += 1
        for i in range(10):
            Cows += min(secretcount[i] , guesscount[i])
        return str(Bulls) + "A" + str(Cows) + "B"
                
        