class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int t = 0;
        for(int i=0 ; i<numbers.length-1 ; i++){
            for(int j=i+1 ; j<numbers.length ; j++){
                t=0;
                if(numbers[i] + numbers[j] == target){
                    t=1;
                    ans[0] = i+1;
                    ans[1] = j+1;
                    break;
                }
            }
            if(t == 1) break;
        }
        return ans;
    }
}