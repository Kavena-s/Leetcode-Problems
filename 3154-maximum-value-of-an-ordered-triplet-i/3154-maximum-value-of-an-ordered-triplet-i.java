class Solution {
    public long maximumTripletValue(int[] nums) {
        long triplet = 0;
        for(int i=0 ; i<nums.length-2 ; i++){
            for(int j=i+1 ; j<nums.length-1 ; j++){
                long calc = 0;
                for(int k=j+1 ; k<nums.length ; k++){
                    calc =(long)(nums[i] - nums[j]) * nums[k];
                    if(calc > triplet) triplet = calc;
                }
            }
        }
        if(triplet > 0) return triplet;
        return 0;
    }
}