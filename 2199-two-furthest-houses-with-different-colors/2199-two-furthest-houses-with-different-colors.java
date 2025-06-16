class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int left = 0, right = n - 1;
        while (colors[0] == colors[right]) {
            right--;
        }
        int max1 = right;
        left = 0;
        while (colors[n - 1] == colors[left]) {
            left++;
        }
        int max2 = n - 1 - left;

        return Math.max(max1, max2);
    }
}
