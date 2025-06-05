class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            int count = 1;
            for(int j=0 ; j<nums.length ; j++){
                if(i != j && nums[i] !=0 ){
                    if(nums[i] == nums[j]){
                            count += 1;
                            nums[j] = 0;
                    }
                }
            }
            arr[i] = count;
        }
        int max = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(arr[i] > max) max = arr[i];
        }
        int sum = 0;
        for(int i=0 ; i<nums.length ; i++){
            if(arr[i] == max) sum += max;
        }
        return sum;
    }
}