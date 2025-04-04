class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int tot = 0;
        int i = 0;
        int t = 0;
        for(i=0 ; i<k ; i++){
            tot = tot + nums[i];
        }
        i = k;
        avg = (double)tot/k;
        while ( i < nums.length){
            tot = tot + nums[i] - nums[t];
            if(avg < (double)tot/k){
                avg = (double)tot/k;
            }
            t = t+1;
            i = i+1;
        }
        return avg;
    }
}