class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        // If we have enough 1s to fill k, just return k (all +1s)
        if (numOnes >= k) return k;

        // Use all 1s first
        int sum = numOnes;
        k -= numOnes;

        // Use all 0s next (they don't change sum)
        if (numZeros >= k) return sum; // no penalty, still same sum

        // Use up all 0s
        k -= numZeros;

        // The rest must be -1s → subtract that from sum
        sum -= k;

        return sum;
    }
}
