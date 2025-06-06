class Solution {
    public boolean areOccurrencesEqual(String s) {
        char[] arr = s.toCharArray();
        int[] nums = new int[s.length()];
        for(int i=0 ; i<arr.length ; i++){
            int count = 1;
            for(int j=0 ; j<arr.length ; j++){
                if(i != j && arr[i] == arr[j] && arr[i] != '/'){
                    count += 1;
                    arr[j] = '/';
                }
            }
            nums[i] = count;

        }
        int temp = 1;
        for(int i=0 ; i<nums.length ; i++){
            if(temp <= nums[i]){
                temp = nums[i];
                break;
            }
        }
        for(int i=0 ; i<nums.length ; i++){
            if(arr[i] != '/' && nums[i] != temp)
                return false;
        }
        return true;
    }
}