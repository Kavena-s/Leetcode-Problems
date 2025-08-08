class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int temp = 1;
        while (n >= temp) {
            n -= temp;
            count++;
            temp++;
        }
        return count;
    }
}