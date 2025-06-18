class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        for(int i=0 ; i<nums.length ; i++){
            int first = i;
            int last =i;
            int temp = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j-1]+1!=nums[j]) {
                    last = j-1;
                    temp = j;
                    break;
                }
                if(j == nums.length - 1) { 
                    last = j;
                    temp = nums.length;
                }   
            }
            if(first == last)list.add(String.valueOf(nums[i]));
            else {
                list.add(String.valueOf(nums[first])+"->"+String.valueOf(nums[last]));
                i=last;
            }
        }
        return list;
    }
}