class Solution {
    public int trap(int[] height) {
        int sum = 0;
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        left_max[0] = height[0];
        for(int i=1 ; i<height.length ; i++){
            left_max[i] = Math.max(height[i],left_max[i-1]);
        }
        right_max[height.length-1] = height[height.length-1];
        for(int i=height.length-2 ; i>=0 ; i--){
            right_max[i] = Math.max(height[i],right_max[i+1]);
        }
        for(int i=0 ; i<height.length ; i++){
            sum += Math.min(left_max[i],right_max[i])-height[i];
        }
        return sum;
    }
}